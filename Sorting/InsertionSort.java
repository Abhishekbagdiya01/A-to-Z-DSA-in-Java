//       When to use Insertion Sort?
    //       - When we have insufficient memory
//       When to avoid Insertion Sort?
    //       - When time is a concern
    //       - Easy to implement
    //       - When we have continuous inflow of numbers and we want to keep them sorted
public class InsertionSort {
   public static void insertionSort(int[] nums) {
      for (int i = 1; i < nums.length; i++) {
          int temp = nums[i], j=i;
          while (j>0 && nums[j-1] > temp) {
              nums[j] = nums[j-1];
              j--;
          }
        nums[j] = temp;
      } 
   }
  public static void printArray(int[] nums) {
   for (Integer i : nums) {
   System.out.print(i + " "); 
   }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] nums = {1,4,7,2,5,10,8,9};
    System.out.println("Original Array");
    printArray(nums);
    System.out.println("Sorted Array");
    insertionSort(nums);
    printArray(nums);
  }
}
