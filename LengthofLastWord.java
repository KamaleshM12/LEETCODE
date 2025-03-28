public class LengthofLastWord {
    public static void main(String[] args) {
        String str = "Hello World ";

        String s = str.trim();

        // System.out.println(s.length());

        char a = ' ';

        int count = 0;

        int len = s.length();

        for (int i = len-1; i >=0; i--) {

            a = s.charAt(i);

            if(a!=(' ')){

                count++;


            }

            // else if (s.charAt(len)== ' '){

            //     i--;

            // }

            else if(a==(' ') && i>=0){

                break;
            }

        }
        System.out.println(count);
    }
    
}
