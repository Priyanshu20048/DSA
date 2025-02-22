import java.util.Scanner;
import java.util.Arrays;
public class FindMin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Element Size :- ");
        int n = sc.nextInt();
         System.out.print("Enter Elements Of Array:- ");
        int [] arr = new int [n];
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int ans = Min(arr);
        System.out.println(ans);
    }
    static int Min(int [] arr){
        if (arr.length == 0){
         return -1 ;
        }
        int temp = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i] < temp){
                temp = arr[i];
            }
            
        }
        return temp;
    }
}
