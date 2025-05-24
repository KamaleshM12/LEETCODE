import java.util.Stack;

public class ValidParentheses {
    public boolean isvalid(String val){
        Stack<Character> s = new Stack<>();
        for(char c : val.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                s.push(c);
            }else{

                if(s.isEmpty()){
                    return false;
                }
                char top = s.pop();
                if(c==')' && top != '(' || c==']' && top != '[' || c=='}' && top != '{'){
                    return false;
                }
        }

        
    }
    return s.isEmpty();
}

public static void main(String[] args) {
    String str = "()()()";
    ValidParentheses v = new ValidParentheses();
    System.out.println(v.isvalid(str));
}
}
