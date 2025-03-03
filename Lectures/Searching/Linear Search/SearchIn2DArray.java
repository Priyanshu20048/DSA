import java.util.Scanner;
import java.util.Arrays;
public class SearchIn2DArray{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Row Size :-  ");
        int m = in.nextInt();
        System.out.println("Enter Column Size :-  ");
        int n = in.nextInt();
        System.out.print("Enter Elements :- ");
        int [][] arr = new int [m][n];
        for (int i = 0;i<arr.length;i++){
            for (int j = 0 ; j < n;j++){
                arr[i][j]= in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}