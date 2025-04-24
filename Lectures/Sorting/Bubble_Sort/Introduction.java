import java.util.*;
public class Introduction{
    public static void main(String[] args){
        int[] arr = {5,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble (int[] arr){
        // run the steps n-1 times
        for (int i = 0;i < arr.length;i++){
            swapped= false;
            // for each stop ,max item will come at the last repective index
            for (int j =1;j<arr.length-i;j++){
                // swap if the item is smaller then the previous one 
                if (arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            // if you didnot swap for a particular value of i , 
            // it means the array is sorted, hence stop the program
            if (swapped== false){
                break;
            }
        }
    }
}