public class MathOperations {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x); 
    }

    public static void main(String[] args) {
        MathOperations m = new MathOperations(); 
        int result = m.mySqrt(4); 
        System.out.println("Square root (truncated to int): " + result);
    }
}
