import java.util.Scanner;
public class LargestUntil0{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        int num = 0;
        int n ;
        while (true){
             n = sc.nextInt();
            if (num < n){
                n = num;
            }
             num = sc.nextInt();
            
               
        }
 System.out.println(n);

        
    }
}

