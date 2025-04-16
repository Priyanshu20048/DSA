// The upper bound of a target value in a sorted array is the first position where an element is strictly greater than the target.
public class UpperBound {
    public static void main(String[] args){
        int [] arr = {2,3,4,67,78,89,90,91};
        int target = 99;
        System.out.println(Ub(arr,target));

    }
    public static int Ub(int[]arr,int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start +(end - start)/2;
            if (arr[mid]<=target){
                start = mid + 1;
            }
            
            else {
                end = mid -1;}
        }
        return start ;
    }
}
