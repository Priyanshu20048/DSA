import java.util.Scanner;
public class SumUntil0 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
        int num = 0;
        while(n>0){
         num = num +n;
        n = sc.nextInt();
      

    }
    System.out.println(num);
}}