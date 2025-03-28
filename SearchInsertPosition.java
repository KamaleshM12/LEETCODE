
import java.util.Scanner;

public class  SearchInsertPosition{
    public static int search(int[] nums, int target) {
        int st = 0;
        int en = nums.length-1;
        while(st<=en){
            int mid = st+(en-st)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]<target){
                st = mid +1;
            }

            else {
                en = mid - 1;
            }

           
        }
        return st;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 3, 5, 6};

        System.out.println("Enter the Target:");
        int target = sc.nextInt();

        int result = search(nums,target);

        System.out.println(result);
    }
}