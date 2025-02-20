// An array is a collection of data types 
// Arrays are mutable (can be changed)
// synatax 
// datatype[] variable_name = new datatype[size];
// 1. this datataype represnts the what is the type of data sored inside the array 
// 2. All the type of data should be same (no mismatch )
// 3.  this reference variable is pointing to an array object that contains type integer elements 
// 4. new is used to create an object , it will create an object in the heap memeory of size mentioned 
// 5. for an integer array  :- by defalut value for every element of array is 0 
// 6 . for a string array  :- by defalut value for every element of array is null 

// Index of an array :- position of an element in an array , it starts from 0 
// null is a special literal of null type 
// you cannot create a variable of null type 
// you can assign null to only non -primitives data type  
// by default any reference variabe will have null type 
public class Arrays_Intro{
    public static void main(String [] args){
        // store 5 rollnos
        int[] roll_no = new int [5];
        // or directly 
        int[] rollno = {23,12,1,3,1};
        // breking this into steps 
        // int[] rollno; // declaration of array, here rollno is getting defined in the stack 
        // this happens at compile time 
        // ros = new int[5];// Initialisation here object is being creted in the heap memory
        // you have to mention the sixe otherwise it will give o an error 
        // this happens at run -time 
        // Dyanmeic memory allocation :- assigning the memory during run time 
        
        // it totally depend on jvm whether  it is continuous memory allocation or not because :-
        // 1. array objects are in heap and heap ojects are not continous 
        // 2. dynamic memory allocation 

        // String Array 
        String[] arr = new String[3];
        System.out.println(arra[2]);// null

        // if you write  more than the size of array or try to print inde out of array
        // it will give you an error -> index out of bound 

    }
}