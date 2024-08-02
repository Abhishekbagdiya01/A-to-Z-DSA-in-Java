//     When to use Selection Sort?
//     - When we have insufficient memory
//     When to avoid Selection Sort?
//     - When time is a concern


public class SelectionSort {
  public static void selectionSort(int[] nums){
    int n = nums.length;
    for (int i = 0; i < n; i++) {
    int min = i;
       for (int j = i+1; j < n; j++) {
          if (nums[min] > nums[j]) {
            min = j;
          } 
       } 
      if (min != i) {
        int temp = nums[i];
        nums[i] = nums[min];
        nums[min] = temp; 
      }
    }
  }
  public static void printArray(int[] nums){
    for (Integer i : nums) {
      System.out.print(i + " , ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] nums = {2,4,3,6,1,5};
    System.out.println("Original Array");
    printArray(nums);
    System.out.println("Sorted Array");
    selectionSort(nums);
    printArray(nums);
  }
}
