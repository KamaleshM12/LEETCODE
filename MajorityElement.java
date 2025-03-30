import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,2,4,4,5};
        int max = 0;
        int mj = 0;
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i: nums){
            m.put(i,m.getOrDefault(i, 0)+1);
        }
        // System.out.println(m);

        for(int j : m.keySet()){
            if (m.get(j) > max) { 
                max = m.get(j);
                mj = j; 
            }
        }
        System.out.println(mj);
    }
    
}
