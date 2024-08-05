public class QuickSort {
  static int partition(int[] array, int start, int end) {
    int pivot = end;
    int i = start - 1;
    for (int j = start; j <= end; j++) {
      if (array[j] <= array[pivot]) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    return i;
  }

  public static void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int pivot = partition(array, start, end);
      quickSort(array, start, pivot - 1);
      quickSort(array, pivot + 1, end);
    }
  }

  public static void printArray(int[] nums) {
    for (Integer i : nums) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] nums = { 1, 4, 7, 2, 5, 10, 8, 9 };
    System.out.println("Original Array");
    printArray(nums);
    quickSort(nums, 0, nums.length - 1);
    System.out.println("Sorted Array");
    printArray(nums);

  }
}
