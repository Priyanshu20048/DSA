import java.util.Scanner;
public class FibonacciSeries{
    public static void main (String[] args){
        int num1 = 0 ;
        int num2 = 1 ;
        int num3 = 0;
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n;i++){
            num3 = num1 + num2 ;
            System.out.print(num1 + ", ");
            num1 = num2;
            num2 = num3;
        
        }
    }
}