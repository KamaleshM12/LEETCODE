import java.util.Stack;

public class DecodeString {

    public static String decodestring(String s){
        Stack<Integer> countstack = new Stack<>();
        Stack<StringBuilder> stringstack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + ch - '0'; 
            }
            else if(ch == '['){
                countstack.push(k);
                stringstack.push(current);
                current = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                int r = countstack.pop();
                StringBuilder previous = new StringBuilder();
                for(int i = 0 ; i<r; i++){
                    previous.append(current);
                }
                current = previous;
            }
            else{
                current.append(ch);
            }

           
        }
         return current.toString();










         

    }
    
}
