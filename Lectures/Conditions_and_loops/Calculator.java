import java.util.Scanner;
public class Calculator{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        
        System.out.print("Your first Number :");
        int num1 = in.nextInt();
        System.out.print("Operation :");
        char op = in.next().trim().charAt(0);
        System.out.print("Your Second  Number :");
        int num2 = in.nextInt();
        int num3 = 0;
        
        if (op == '+'){
            num3 = num1 +num2;
            
        }
         if (op == '-'){
            num3 = num1 -num2;
            
        }
         if (op == '*'){
            num3 = num1 *num2;
            
        }
         if (op == '/'){
            num3 = num1 /num2;
            
        }
        System.out.println(num3);
        
    }}
