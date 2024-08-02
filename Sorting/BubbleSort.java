

/*
      When to use Bubble Sort?
      - When the input is almost sorted
      When to avoid Bubble Sort?
      - Average time complexity is poor
*/

public class BubbleSort {
  public static void bubbleSort(int[] nums){
    int n = nums.length;
    for (int i = 0; i < n-1; i++) {
       for (int j = 0; j < n-i-1;j++) {
            if (nums[j] > nums[j+1]) {
             int temp = nums[j];
             nums[j] = nums[j+1];
            nums[j+1] = temp;
            }  
       } 
    }
    
  }
public static void printArray(int[] nums){
        for (int var : nums) {
        System.out.print(var+" , "); 
        }
    }
  public static void main(String[] args) {
    System.out.println("This is Bubble Sort");
    int[] nums ={1,2,4,3,6,5,9,10,7};
    System.out.println("Original Array");
    printArray(nums);
    System.out.println();
    bubbleSort(nums);
    System.out.println("Sorted array");

    printArray(nums);
  }  
} 
