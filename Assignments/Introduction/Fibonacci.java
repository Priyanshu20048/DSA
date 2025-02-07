// To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int n1 = 0 ;
        int n2 = 1 ;
        
        
        for (int i = 0 ; i <=n;i++){
        System.out.print(n1 +" ,");
       int next =  n1 + n2;
           
            n1 = n2;
            n2=next;

        }

    }
}