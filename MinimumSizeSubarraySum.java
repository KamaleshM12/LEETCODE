public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {8,3,5,6,3,6,9};
        int len = nums.length;
        int tar = 8;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int i = 0;
        for(int j = 0; j<len;j++){
            sum += nums[j];

            while(sum > tar){
                min = Math.min(min, j - i + 1);
                sum -=nums[i];
                i++;
            }
            
        }
        System.out.println((min==Integer.MAX_VALUE)? 0 : min);
       
        

    }
    
}
