import java.util.Scanner;
public class NumExample {
    public static void main(String[] args) {
       // write afunction that taks in a number and prints it 
       // print first 5 numbers 1 2 3 4 5  
       print(1);  
    }
    static void print(int n ){
        System.out.println(n);
        print1(2);
    }

    static void print1(int n ){
        System.out.println(n);
        print2(3);
    }
    static void print2(int n ){
        System.out.println(n);
        print3(4);
    }
    static void print3(int n ){
        System.out.println(n);
        print4(5);
    }
    static void print4(int n ){
        System.out.println(n);
    }
    
}

-----------------------------------------------------------------------------------------------
----------------------------RECURSION-------------------------------------------------------------

function that calls itself  

now the same function in recursion 
public class NumExample{
    public static void main(String[] args){
        print(1);
    }
    static void print(int n ){
        if (n ==5){ // here this is the base condition 
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call 
        // Tail Recursion 
        print(n+1); 
    }
}

// Base condition in recursion :- it is a condition where the recursion stop making new calls 
// if you are calling a function again and again 
-> it will take separate memory , if there is no base condition , function call will keep happening ,
stack memory will be filled again and again 
-> one time will come where the memory of the computer exceeds , this will goive StackOverflow error 

// Why Recursion ?
// 1. It helps us in solving bigger & complex problems in a simple way
// 2. You can convert recursion solutions into terations and vice -versa 
// 3. Space Complexity is not constant because of recursive calls 
// 4. It helps in breaking down bigger problems into smaller one 

//------------------------------------------------------------------------------------------------
Visualisation of Recursion
    ----------------Recursion Tree -------------------------------------------
                               (Program Ends)
 (Program Starts)    main()  <-|
                       |       |
                     print(1)<-|
                       |       |
                     print(2)<-|
                       |       |
                     print(3)<-|
                       |       |
                     print(4)<-|
                       |       |
                     print(5)--|

// How to unerstand and approach a problem 
1. Idnetify if you can break down problem into smaller problems 
2. Write the recurrence relation if needed
3. Draw the recursion Tree
4. About the tree :- 
               1. see the flow of function , how they are getting in stack 
               2. identify & focus on left tree calls and right tree calls 
               3. 