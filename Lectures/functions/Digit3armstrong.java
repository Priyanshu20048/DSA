// print all the 3 digit armstrong no. in java 
import java.util.Scanner;
public class Digit3armstrong{
    public static void main(String [] args){
        armstrong();
        
    }
    static void armstrong(){
        for (int i =100;i<=999;i++){
            int num1 = i ;
           int  num3 = i;
            double  sum2 = 0;
         for (int j = 1; num1 > 0;j++){
            int num2 = num1%10;
            double sum = Math.pow(num2,3);
             sum2 = sum2+sum;
            num1 = num1/10;
         }
         if (num3==sum2){
            System.out.println(num3);
         }
        }

    }
}