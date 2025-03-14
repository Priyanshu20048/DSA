// return the index 
// return -1 if it does not exist 
import java.util.*;
public class Ascending {
    public static void main(String [] args){
        int [] arr = {2,3,4,5,7,9,79,89};
        int target = 2;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
   
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end ){
            //find the middle element 
            // int mid = (start + end) / 2; // might be possible that (start + end )exceedes int range
        
        // Better way to find mid 
        int mid= start +(end - start) / 2;
        if (target < arr[mid] ){
            end = mid -1;
        }
        else if (target > arr[mid]){
            start = mid +1;
        }
        else {
            // ans found 
            return mid ;
        }
        }
        return -1;
    }
}