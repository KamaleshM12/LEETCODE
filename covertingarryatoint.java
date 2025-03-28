
import java.util.Arrays;

public class covertingarryatoint {
    public class Main {
        public static void main(String[] args) {
            String[] arr = {"1", "2", "3", "6", "5"};
            int[] intArr = new int[arr.length];
            Arrays.sort(arr);
    
            for (int i = 0; i < arr.length; i++) {
                intArr[i] = Integer.parseInt(arr[i]);
            }
    
            // Print the integer array
            for (int num : intArr) {
                System.out.print(num + " ");
            }
        }
    }
    
    
}
