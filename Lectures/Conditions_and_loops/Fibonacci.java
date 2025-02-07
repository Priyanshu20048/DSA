import java.util.Scanner;
// Find the nth fbonacci no 
public class Fibonacci{
    public static void main(String [] args){
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1 ;
        if (n == 0){
            System.out.print(p);
        }
        else if (n==1){
            System.out.print(i);
        }
        else {
        
        int count = 2 ;
        while (count <=n){
            int temp = i ;
            i = i +p;
            p = temp;
            count ++;
        }
        System.out.println(i);

        }

    }
}
