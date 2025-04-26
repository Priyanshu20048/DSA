package Lectures.Sorting.Selection_Sort;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args){
        int[] arr = {5,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
}

static void selection(int[] arr){
    for (int i = 0 ; i <arr.length;i++){
        // find the max item in the reamining array and swap with correct index 
        int last = arr.length-i-1;
        int maxIndex = getMaxIndex(arr,0,last);
    }
}
private static int getMaxIndex(int[] arr,int s)
}

