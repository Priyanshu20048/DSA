import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class SwappingValuesByIndex{
    public static void main(String[] args){
        int arr[] = new int [5];
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ; i < arr.length;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swap(arr,a,b);
        System.out.println(Arrays.toString(arr));


    }
    static void Swap(int [] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}