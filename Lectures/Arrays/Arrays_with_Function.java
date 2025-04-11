import java.util.*;
public class Arrays_with_Function {
    public static void main(String[] args){
     int []arr={3,4,5,67,78};
     System.out.println(Arrays.toString(arr));
     fun(arr);
     System.out.println(Arrays.toString(arr));

    }
    static void fun(int[] arr){
        arr[1]=0;
        arr[arr.length -1]=100;

    }
}
