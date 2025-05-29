public class twosum_II {
    
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            else if(sum>target){
                i++;
            }
            else{
                j--;
            }
        }

       return new int[]{};
}

public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,7,8,9};
    int target = 8;

    twosum_II t = new twosum_II();
    System.out.println(t.twoSum(arr, target));

}
}
