import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abbacdbb";
        Set<Character> hs = new HashSet<>();
        int st = 0;
        int e = 0;
        int len = 0; 
        while (e < s.length()) {
            char c = s.charAt(e);
            while (hs.contains(c)) {
                hs.remove(s.charAt(st));
                st += 1;
            }
            hs.add(c);
            int size = e - st + 1;
            len = Math.max(len, size);
            e++;
        }
        System.out.println(len);
    }
}
