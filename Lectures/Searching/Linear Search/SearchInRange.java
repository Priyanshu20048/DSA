// Q. Search for 3 in the rage of index [1,4]
// arr = [18, 12, -7, 3, 14, 28]
import java.util.Scanner;
import java.util.Arrays ;
public class SearchInRange{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of Array:- ");
        int m = sc.nextInt();
        int [] arr = new int [m];
        System.out.println("Enter Elements of Array:- ");
        for (int i =0;i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter Target:- ");
        int target = sc.nextInt();
        System.out.print("Enter Starting Range :- ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Range :- ");
        int end  = sc.nextInt(); 
        boolean ans = Range(arr,target,start,end);
        System.out.print(ans);

    }
    static boolean  Range(int[]arr,int target,int start,int end ){
        if (arr.length == 0){
            return false ;
        }
        for (int i =start;i<=end ;i++){
            if (arr[i]==target){
                return true ;
            }
        }
        return false ;
    }
}