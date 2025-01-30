                
            // APPROACH - 1 
// import java.util.Scanner;
// public class largestof3{
//     public static void main (String [] args){
//         Scanner in =  new Scanner(System.in);
//         int a = in.nextInt();
//         int b = in.nextInt();
//         int c = in.nextInt();

//         if( (a>b) & (a>c)){
//             System.out.println("a is largest : " + a);

//         }
//         else if ((b>a) & (b>c)){
//             System.out.println("b is largest : " + b) ;

//         }
//         else {
//             System.out.println("c is largest : " + c);
//         }
//     }
// }

//------------------------------------------------------------------------------------------------------------------------------------
                                        // APPROACH 2 
// import java.util.Scanner;
// public class largestof3{
//     public static void main (String [] args){
//         Scanner in = new Scanner(System.in);
//         int num1 = in.nextInt();
//         int num2 = in.nextInt();
//         int num3 = in.nextInt();

//         int max = num1;
//         if (num2 > max) {
//             max = num2 ;
//         }
//          if  (num3 > max) {
//             max = num3 ;

//         }
//         System.out.println(max + " is largest");    }
// }

//-------------------------------------------------------------------------------------------------------------------
                                // Approach 3 
import java.util.Scanner;
public class largestof3{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
int max = Math.max(num3,Math.max(num1,num2));
System.out.println(max);
}}