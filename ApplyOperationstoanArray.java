import java.util.*;
class ApplyOperationstoanArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] == nums[j]) {
                nums[i] *=2;
                nums[j] *= 0;
            }
            i++;
        }
        int k= 0;
        for(int l = 0 ; l <=nums.length-1; l++) {
            if(nums[l]!=0){
                int temp = nums[l];
                nums[l] = nums[k];
                nums[k] = temp;
                k++;

            }

        }

        System.out.println(Arrays.toString(nums));




    }
}