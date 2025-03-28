
// import java.util.Scanner;

// public class febno {
//     public static void main(String[] args) {
//         int a = 0;
//         int b = 1;
//         int sum = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the target");
//         int n = sc.nextInt();
//         System.out.print(a + " " );
//         System.out.print(b + " " );
//         for (int i = 1; i < n; i++) {
//             sum = a+b;
//             a = b;
//             b = sum;
//             System.out.println(sum);

//             String output = (i == 3) ? "Fizz" : String.valueOf(sum);
//             System.out.print(output + " ");

            
//         }
//     }
    
// }

// import java.util.Scanner;

// public class febno {
//     public static void main(String[] args) {
//         int a = 0, b = 1, sum;
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the target:");
//         int n = sc.nextInt();
//         sc.close(); 


//         System.out.print(a + " ");
//         if (n > 1) System.out.print(b + " ");

//         for (int i = 2; i < n; i++) {  
//             sum = a + b;
//             a = b;
//             b = sum;

//             String output = ((sum%3) == 0) ? "Fizz" : String.valueOf(sum);

//             System.out.print(output + " ");
//         }
//     }
// }



import java.util.Scanner;

public class FibonacciFizz {
    public static void main(String[] args) {
        int a = 0, b = 1, sum;
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close(); 
        char c='"';
        String d=c+"Fizz"+c;
        String e=c+"Buzz"+c;

        System.out.print(a + " ");
        if (n > 1) System.out.print(b + " ");

        for (int i = 2; i < n; i++) {  
            sum = a + b;
            a = b;
            b = sum;

            // String output = ((sum%3) == 0) ? d  : String.valueOf(sum);
            String output;
            if (sum % 3 == 0) {
                output = "\"Fizz\"";
            } else if (sum % 5 == 0) {
                output = "\"Buzz\"";
            } else {
                output = String.valueOf(sum);
            }

            System.out.print(output + " ");
        }
    }
}