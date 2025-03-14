import java.util.*;
public class OrderAgnostic {
    public static void main(String [] args){
        int[] arr = {2,4,7,8,9, 13, 15};
        int [] arr1 ={45,34,23,11,6,3,1};
        int target = 34;
        int ans = ogbs(arr1,target);
        System.out.println(ans);

        

    }
    static int ogbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        // find whether ascending or descending oder 
        boolean isAsc;
        if (arr[start]<arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }

        
        while (start <= end){
            int mid = start +(end-start)/2;
        if (isAsc == true){
            if (target > arr[mid]){
                start = mid +1;

            }
            else if (target < arr[mid]){
                end = mid -1;
            }
            else {
                return mid ;
            }
        }
        else {
            if (target < arr[mid] ){
                start = mid  +1;
            }
            else if (target > arr[mid]){
                end = mid -1;
            }
            else {
                return mid;
            }
        }
       

        }
        return -1;
}
}
