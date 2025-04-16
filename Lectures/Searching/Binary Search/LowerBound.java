// Lower bound is the first occurrence of target element. 
// If element not found index of first element greater than target is returned.
public class LowerBound {
    

public static void main(String [] args){
    int [] arr = {2,3,4,67,78,89,90,92,95,104,108,134};
    int target= 104;
    System.out.println(Lb(arr,target));
}

public static int Lb(int[] arr, int target){
    int start =0;
    int end = arr.length-1;
    while (start<=end){
        int mid = start +(end -start)/2;
        if (arr[mid]> target){
            end = mid -1;
        }
        else if (arr[mid]<target){
            start = mid+1;
        }
        else {
            return mid;
        }

    }
    return start;
}
}

// improved version 
// public static int Lb(int[] arr, int target) {
//     int start = 0;
//     int end = arr.length - 1;

//     while (start <= end) {
//         int mid = start + (end - start) / 2;

//         if (arr[mid] < target) {
//             start = mid + 1;
//         } else {
//             end = mid - 1;
//         }
//     }

//     return start;
// }
