import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

    public static void main(String[] args) {
        
        int[] nums = {-100,-5,-3,1,3,5};

        int product = 1;

        int len = nums.length;

        for (int j = 0; j < len-1; j++) {

            nums[j] = Math.abs(nums[j]);
            
        }

        Arrays.sort(nums);

        for(int i = len-1; i >len-4; i--){

            

            product *= nums[i];
        }

        System.out.println(product);

    }
    
}
