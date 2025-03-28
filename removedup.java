
public class removedup {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; 
        int k = 0;
        for(int i = 1; i<nums.length;i++){
            if(nums[k] != nums[i]){
                nums[k] = nums[i];
                
                k++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
    
}
