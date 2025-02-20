import java.util.Scanner;
import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args){
     int [] arr = new int [5];
     Scanner sc = new Scanner (System.in);
     for (int i = 0 ; i < arr.length;i++){
           arr[i] = sc.nextInt();

     }
     System.out.println(Arrays.toString(arr));
    int m = max(arr);
    System.out.println("Maximum Value in this Array : " + m);

    }
    static int max (int arr[]){
        int temp = arr[0] ;
        for (int i =0 ; i < arr.length ;i++){
        if (arr[i] > temp){
            temp = arr[i];

        }

    }
    return temp;
}}