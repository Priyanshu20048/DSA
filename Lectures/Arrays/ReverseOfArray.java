import java.util.Scanner;
import java.util.Arrays;
public class ReverseOfArray{
    public static void main(String[] args){
         Scanner in = new Scanner (System.in);
        int m = in.nextInt();
         int [] arr = new int [m];
       
       for(int i =0 ; i < arr.length;i++){
            arr[i] =in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        int [] c = Reverse(arr);
        System.out.println(Arrays.toString(c));

    }
    static int [] Reverse(int[] arr){
        
        int [] b = new int [arr.length];
         for (int j = 0;j<arr.length;j++){
            b[j] = arr[arr.length - 1-j ];
            
         } 
        
        return b ;
        
    }}
