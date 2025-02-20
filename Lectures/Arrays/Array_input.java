import java.util.Scanner;
public class Array_input{
    public static void main(String[] args){
        int[] arr = new int [5];
        for (int i = 0 ; i < arr.length;i++){
            Scanner in = new Scanner(System.in);
             arr[i]=in.nextInt();
                
        }
     for (int i = 0 ; i < arr.length;i++){
        System.out.print(arr[i]);
    }
    // enhanced version for this loop 
    // for each loop 
    // for every element in array , print the element 
    for (int num:arr){
        System.out.print(num);
    }
    // another way of displaying array 
    // it has internal for loop 
    System.out.println(Arrays.toString(arr));
    }


}