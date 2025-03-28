
import java.util.Arrays;

public class twosum{
    public int[] twoSum(int[] nums, int target) {
        
      
        for (int i = 0; i < nums.length; i++) {
        for (int j = 1; j < nums.length; j++) {
            if(nums[i]+nums[j]==target){
               return new int[]{i,j};
            }
        }
           
        }
        return new int[]{};
    }
    public static void main(String ...args) {
        int[] nums = {3,2,3};
        int target ;
        twosum t = new twosum();
        System.out.println(Arrays.toString(t.twoSum(nums, 6)));
       
    }
}