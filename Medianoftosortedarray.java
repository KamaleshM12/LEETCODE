
import java.util.Arrays;

public class Medianoftosortedarray {

    public static void main(String[] args) {
        int[] n1 = {1,2};
        int[] n2 = {3,4,5};
        double med = 0.0f;

        int[] m = new int[n1.length+n2.length];
        System.arraycopy(n1, 0, m, 0, n1.length);
        System.arraycopy(n2, 0, m,n1.length,n2.length);

        System.out.println(Arrays.toString(m));
        int mlen = m.length;
            int mid = (mlen)/2;
            if (mlen % 2 == 0) {
                med = (m[mid - 1] + m[mid]) / 2.0; 
            } else {
                med = m[mid]; 
            }
        System.out.println(med);
        
    }

    
}
