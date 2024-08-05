public class MergeSort {
  public static void merge(int[] nums, int left, int middle, int right) {
    int[] leftTempArray = new int[middle - left + 2];
    int[] rightTempArray = new int[right - middle + 1];

    for (int i = 0; i <=  middle - left; i++) {
      leftTempArray[i] = nums[left + i];
    }
    for (int i = 0; i < right - middle; i++) {
      rightTempArray[i] = nums[middle + 1 + i];
    }

    leftTempArray[middle - left + 1] = Integer.MAX_VALUE;
    rightTempArray[right - middle] = Integer.MAX_VALUE;
    int i = 0, j = 0;
    for (int k = left; k <= right; k++) {
      if (leftTempArray[i] < rightTempArray[j]) {
        nums[k] = leftTempArray[i];
        i++;
      } else {
        nums[k] = rightTempArray[j];
        j++;
      }
    }
  }

  public static void mergeSort(int[] nums, int left, int right) {
    if (right > left) {
      int middle = (left + right) / 2;
      mergeSort(nums, left, middle);
      mergeSort(nums, middle + 1, right);
      merge(nums, left, middle, right);
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
    mergeSort(nums, 0, nums.length - 1);
    System.out.println("Sorted Array");
    printArray(nums);

  }
}
