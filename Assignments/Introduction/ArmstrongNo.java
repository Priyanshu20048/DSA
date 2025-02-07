// To find Armstrong Number between two given number.

// An Armstrong number (also known as a narcissistic number) is a number 
// that is equal to the sum of its own digits each raised to the power of the number of digits. For example:

// 153 is an Armstrong number because it has 3 digits,
//  and (1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153).
// 9474 is also an Armstrong number because it has 4 digits,
//  and (9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474).
import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int num1 = num;
        int num2= num;
        int count = 0;
        double  arms = 0;
        double  sum = 0;
        int n =0;
        int i = 0 ;
        while (num!=0){
            count++;
            num=num/10;
        }
    
    

    while(num1!=0){
       n = num1%10;
       arms = Math.pow(n,count);
       sum = sum + arms;
       num1 = num1/10;
    
    }
    
    if (sum == num2) {
        System.out.println("Armstrong");
    }
    else {
        System.out.println("No");
    }
}
}