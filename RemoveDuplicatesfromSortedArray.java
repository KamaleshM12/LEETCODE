import java.util.*;

class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i<=nums.length-1;i++){
            if(nums[i] != nums[k]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
        
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}; 

        int k = solution.removeDuplicates(nums); 

       
        System.out.println("Unique elements count: " + k);
        System.out.println("Modified array (first " + k + " elements): " + Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
    }
}
