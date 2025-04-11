// Floor of No :- greatest no in an array that is equal to or smaller than target 
// arr = [2, 3, 5, 9, 14, 16, 18]
// target = 15
import java.util.*;
public class FloorOfNo {
    public static void main(String [] args){
    int [] arr = {2, 3, 5, 9, 14, 16, 18};
    int target = 18;
    int ans = Floor(arr,target);
    System.out.println(ans);
    
}
static int Floor(int []arr,int target){
    int start = 0;
    int end = arr.length -1;
    boolean Asc;
    if (arr[start] <arr[end]){
        Asc = true ;
    }
    else {
        Asc = false ;
    }
    if (target > arr[end]){
        return -1;
    }
    else {
        while (start <=end){
            int mid = start +(end - start)/2;
            if (Asc == true ){
                if (arr[mid] > target){
                    end = mid -1;
                }
                else if (arr[mid] < target){
                    start = mid +1;
                }
                else {
                    return arr[mid];
                }}
            else {
                if (arr[mid] < target){
                    start = mid +1;
                }
                else if (arr[mid] > target){
                    end = mid -1;
                }
                else {
                    return arr[mid];
                }
            }
                
            }
            start = end ;
            return arr[start];

        }
    }

}

