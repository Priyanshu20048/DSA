// fin maximu in 2d array 
// {23,4,1},
//  {18,12,3,9},
//  {78,99,34,56},
// {18,12}
import java.util.*;
public class Main{
    public static void main(String args[]){
        int [][] arr = {
{23,4,1},
{18,12,3,9},
{78,99,34,56},
{18,12}
        };
    System.out.println(Max(arr));
    
    }
public static int Max(int[][]arr){
    int max = arr[0][0];
    for (int i = 0; i <arr.length; i ++){
        for (int j = 0 ;j <arr[i].length;j++){
            if (arr[i][j] > max){
                max = arr[i][j];
            }
        }
    }
    return max;

}
}

// ----returning index values ----------------------------------------------------------------------------------------
// fin maximu in 2d array  with index values 
// {23,4,1},
//  {18,12,3,9},
//  {78,99,34,56},
// {18,12}
import java.util.*;
public class Main{
    public static void main(String args[]){
        int [][] arr = {
{23,4,1},
{18,12,3,9},
{78,99,34,56},
{18,12}
        };
        int [] ans = Max(arr);
    System.out.println(Arrays.toString(ans));
    
    }
public static int[] Max(int[][]arr){
    int max = Integer.MIN_VALUE; // if you are not sure that your is not empty us eit otherwise an empty error will throw error 
    int [] pos = new int[2];
    for (int i = 0; i <arr.length; i ++){
        for (int j = 0 ;j <arr[i].length;j++){
            if (arr[i][j] > max){
                max = arr[i][j];
                pos [0]=i;
                pos [1] =j;
               
            }
            
        }
       
        
    }
    return pos;

}
}
