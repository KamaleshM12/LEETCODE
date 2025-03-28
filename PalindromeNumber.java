public class PalindromeNumber {
    static class Solution {  
        public boolean isPalindrome(int x) {
            String y = Integer.toString(x);
            String b = "";  
            
            for (int i = y.length() - 1; i >= 0; i--) { 
                b += y.charAt(i); 
            }

            return y.equals(b);  
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();  
        System.out.println(solution.isPalindrome(121));   
    }
}
