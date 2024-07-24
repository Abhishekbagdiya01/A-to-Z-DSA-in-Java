import java.util.HashSet;
class FindDublicate{
    public static void main(String[] args) {
      int [] arr = {1,3,4,2,2};
      int result = findDubAlgo1(arr);
     int result1 = findDubAlgo2(arr);
      System.out.println(result);
      System.out.println(result1);
    }
    // Brute force
    public static int findDubAlgo1(int[] nums){
      for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
          if (nums[i]==nums[j]) {
            return nums[i];
          }
        }
      }
      return 0;
    }
    // Using HashSet
    public static int findDubAlgo2(int[] nums){
     HashSet<Integer> set = new HashSet<>();
     for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return nums[i];
      }
      set.add(nums[i]);
     }
      return 0;
    }
}