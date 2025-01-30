// Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Largest{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 > num2){
            System.out.println(num1 + " is largest");}
        else {
            System.out.println(num2 + " is largest");
        }
        }

    }
