import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m + n;
        int j = 0;
        for (int i = m; i < l; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1)); 
    }

    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0}; 
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.merge(nums1, m, nums2, n);
    }
}
