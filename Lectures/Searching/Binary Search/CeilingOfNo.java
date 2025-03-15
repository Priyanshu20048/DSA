// Ques. arr= [2, 3, 5, 9, 14, 16, 18]
// target = 15
// Ceiling Of No = smallest element in that array greter than or equal to target



import java.util.*;
public class CeilingOfNo{
    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18 };
        int target = 10;
        int ans = Ceiling(arr, target);
        System.out.println(ans);

    }
    static int Ceiling (int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc;
        if (start < end ){
            isAsc = true;
        } 
        else {
            isAsc = false ;
        }
        if (target > arr[end]){
            return -1;
        }
        else {
        while (start <= end ){
            if (isAsc == true) {
                int mid = start + (end - start )/2;
                if (arr[mid] < target){
                    start = mid +1; 
                }
                else if (arr[mid]>target){
                    end = mid -1;
                }
                else {
                    return arr[mid];
                }

            }
            else  {
                int mid = start + (end - start )/2;
                if (arr[mid] > target){
                    start = mid +1; 
                }
                 else if (arr[mid]<target){
                    end = mid -1;
                }
                else  {
                    return arr[mid];
                }

            }
            
        }
        
        start = end +1  ;
        return arr[start];
    }}}
