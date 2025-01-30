// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 =  in.nextInt();
        System.out.println("Operation:");
        char op = in.next().trim().charAt(0);
        switch(op){
            case'+':
                System.out.println(num1+num2);
               break;
               case'-':
                System.out.println(num1-num2);
               break;
    case '*':
                System.out.println(num1*num2);
               break;
               default:
                System.out.println(num1/num2);
    
    
        }


    }
}