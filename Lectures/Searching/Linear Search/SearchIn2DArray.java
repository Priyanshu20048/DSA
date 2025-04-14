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
/*  import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
         };
         int target = sc.nextInt();
         int [] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][]arr,int target){
        for (int i =0 ; i <arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                if (arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
}
    
*/
