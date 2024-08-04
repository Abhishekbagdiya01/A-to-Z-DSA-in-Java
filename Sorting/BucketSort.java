import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
  
  public static void bucketSort(int[] nums) {
    int numberOfBucket = (int) Math.ceil(Math.sqrt(nums.length));
    int maxValue = Integer.MIN_VALUE;
      for (Integer value  : nums) {
        if (value > maxValue) {
            maxValue = value;
        }
      }
    ArrayList<Integer>[] buckets = new ArrayList[numberOfBucket];
    for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new ArrayList<Integer>();
    }

    for(int num : nums){
      int bucketNo = (int) Math.ceil(((float) num*numberOfBucket)/ (float) maxValue);
      buckets[bucketNo-1].add(num);
    }
    System.out.println("Printing Buckets before sorting");
     printBuckets(buckets);

     for (ArrayList<Integer> bucket : buckets) {
        Collections.sort(bucket); 
     }
    System.out.println("Printing Buckets after sorting");
     printBuckets(buckets);
    int index  = 0;
    for (ArrayList<Integer> bucket : buckets) {
        for (int var : bucket) {
           nums[index] = var;
           index++;
        }          
    }
   }

public static void  printBuckets(ArrayList<Integer>[] buckets){
    for (int i = 0; i < buckets.length; i++) {
       System.out.println("Bucket " + i);
       for (int j = 0; j < buckets[i].size(); j++) {
            System.out.print("  " + buckets[i].get(j)+ " "); 
       }
      System.out.println();
      
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
    bucketSort(nums);
    System.out.println("Sorted Array");
    printArray(nums);
  }

}
