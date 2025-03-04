// this is without function 
import java.util.Scanner;
public class LeetCode1281 {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =0;
        int mul = 1;
        int add = 0;
        for (int i =1;n>0;i++){
            num = n%10;
            mul = mul * num;
            add = add + num;
            n= n/10;
        }
        int ans = mul - add;
        System.out.println(ans);
        

    }
}