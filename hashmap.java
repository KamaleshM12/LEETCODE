
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hashmap{
    public static void main(String[] args) {
        HashMap<Character , Integer> k = new HashMap<>();
        // k.put('k',1); 
        // k.put('a', 2);
        // k.put('a', 3);
        // k.put('a', 4);
        String a = "ENGINEERING";
        for (int i = 0; i < a.length(); i++) {
            char ch=a.charAt(i);
            k.put(ch,k.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer>gopal:k.entrySet()){
            int value=gopal.getValue();
            char key=gopal.getKey();
            if(value==1){
                System.out.println(key);
            }
        }
        
        
        }
    }
