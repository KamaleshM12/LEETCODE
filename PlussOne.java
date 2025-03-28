import java.util.*;
public class PlussOne{
    public static void main(String ...args){
        int[] nums = {1,2,3};
        int n = nums.length;
        for(int i = n-1; i >=0; i--){
            if(nums[i]<9){
                nums[i]++;
                System.out.print(Arrays.toString(nums));
            }
            else{
                nums[i]=0;
            }

            int[] num= new int[n+1];
            num[0]=1;
            System.out.print(Arrays.toString(num));


        }
    }
}











// import java.util.Arrays;

// public class Solution {

//     public static int[] plusOne(int[] digits) {
//         int n = digits.length;
//         for (int i = n - 1; i >= 0; i--) {
//             if (digits[i] < 9) {
//                 digits[i]++;
//                 return digits;
//             } else {
//                 digits[i] = 0;

//             }
//         }

//         int[] f = new int[n + 1];
//         f[0] = 1;
//         return f;
//     }

//     // public static void main(String[] args) {
//     //     int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
//     //     System.out.println(Arrays.toString(plusOne(a)));
//     // }
// }