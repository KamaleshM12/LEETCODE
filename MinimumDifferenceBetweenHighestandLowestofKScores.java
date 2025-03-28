import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        int k = 2;

        Arrays.sort(nums);

        int minDif = Integer.MAX_VALUE;

        
        for (int i = 0; i <= nums.length - k; i++) {
            int dif = nums[i + k - 1] - nums[i];
            minDif = Math.min(minDif, dif);
        }
        System.out.println("The minimum difference is: " + minDif);
    }
}
