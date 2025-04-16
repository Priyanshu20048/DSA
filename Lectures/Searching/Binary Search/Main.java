public class Main {
    public static void main(String[] args){
    int [] arr = {2,4,6,8,10,12};
    int target = 16;
    int ans = bin(arr,target);
    System.out.println(ans);
    
}
public static int bin(int[]arr,int target){
    int start =0;
    int end = arr.length - 1;
    
    while (start<=end){
        int mid = start + (end-start) /2;
        if (arr[mid]>target){
            end = mid-1;
        }
        else if (arr[mid]<target){
            start = mid+1;
        }
        else {
            return mid;
        }
    }
    return -1;
}}
