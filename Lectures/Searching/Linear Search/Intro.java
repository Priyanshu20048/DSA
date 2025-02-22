// Q. Find whether 14 exists in the array or not 
// Starts seacrching from the first element till you found the element you are looking for 
// it wll return return index no 
// if no value fund return -1;
// Time Complexity :- best case is 0(1) i.e Constant (u find the elemnt ata 0th index i.e it is independent of the size of array )()
 //                     worst case :- 0(n) i.e  n size of array (u didn't find the element in the array , dependent on size )(linear Graph )
import java.util.Scanner;
import java.util.Arrays;
public class Intro{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:");
        int n = sc.nextInt();

        System.out.print("Enter Elements of Array:");
        int [] arr = new int [n];
        for (int i = 0; i <arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array :-");
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the Target element :");
        int target = sc.nextInt();

        int index = LinearSearch( arr,target); 
        System.out.println(index);

        if (index < 0){
            System.out.println("Oops element not found");
        }
    }
    static int LinearSearch(int[] nums,int a){
        if (nums.length ==0){
            return -1;
        }
        for (int i =0;i<nums.length;i++){
            if (nums[i] == a){
                return i;
            }    
            
        }
        // this element will execute if none of the return statements above have executed
        // hence the traget not found 
        return -1; 
    }

// returning element from Linear Search 
 static int LinearSearch2(int[] nums,int a){
        if (nums.length ==0){
            return -1;
        }
        for (int element : nums){
            if (element == a){
                return element;
            }    
            
        }
        // this element will execute if none of the return statements above have executed
        // hence the traget not found 
        return Integer.MAX_VALUE; 
    }

// returning true / false  from Linear Search 
 static boolean  LinearSearch2(int[] nums,int a){
        if (nums.length ==0){
            return false ;
        }
        for (int element : nums){
            if (element == a){
                return true ;
            }    
            
        }
        // this element will execute if none of the return statements above have executed
        // hence the traget not found 
        return false ; 
    }