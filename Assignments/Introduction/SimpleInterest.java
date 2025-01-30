// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Principal Amount");
        float p = in.nextFloat();
        System.out.println("Enter Time Taken");
        int t = in.nextInt();
        System.out.println("Enter Rate Applied");
        float r = in.nextFloat();
        float si = (p *r*t)/100;
        System.out.println("Simple Interest :" + si);
    }
}
