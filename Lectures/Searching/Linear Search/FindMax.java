import java.util.Scanner;
import java.util.Arrays;
public class FindMax{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array :- ");
        int n = sc.nextInt();
        System.out.print("Enter Elements of Array:- ");
        int [] arr = new int [n];
        for (int i = 0 ; i <arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int ans = Max(arr);
        System.out.println(ans);

    }
    static int Max(int [] arr){
      
        if (arr.length == 0){
            return -1;
        }
          int temp = arr[0];
        for (int i = 0 ; i <arr.length;i++){
            if (temp < arr[i]){
                temp = arr[i];
            }
            
        }
        return temp;
    }
}