import java.util.Scanner;
public class ReverseOfNum{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int digit=0 ;
        int reverse = 0;
        while (num > 0){
            digit = num % 10;
             reverse =  (reverse * 10) + digit;
             num = num/10;
        }
        System.out.println(reverse);
    }
}