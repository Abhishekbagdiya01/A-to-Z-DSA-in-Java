/**
 * RemoveDublicate
 */
import java.util.HashSet;
public class RemoveDublicate {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
       
      System.out.println(removeDublicate(nums));
    }
    public static int removeDublicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }else{
                nums[i] = Integer.MAX_VALUE;
            }
        
        }
    return  set.size();
        
    }
}