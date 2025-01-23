 import java.util.Scanner;
// public class First_program{
//     public static void main (String[] args) {
//         System.out.println("Hello world!");
//         Scanner input = new Scanner(System.in);
//         System.out.println(input.nextInt());

//     }
// }

// Here public :- means that it can be accessed from anywhere
//  class:- group of properties and functions 
// class name should be same as file name 
// main :- reserved word for execution (entry point)
// static :- is used because we want to run main function without creating the object of First_program class
// void :- because we dont want any return value after functio ends 
// System :- it is a class 
// out :- it is a variable of system which is of type prinstream and it has method println
// System.out :- means print whatever on commandline 
// out :- by default  null
// but you can change the value of out 
// printstream :- it is a class which adds representation functionaities to the computer
// Scanner class :- used for input 
//                   available in java.util package 
// System.in :- default value :- keyboard to take inputs 
// you can also change the value by writing like file in place of System.in
//----------------------------------------------------------------------------------------------------------------------

// public class Primitives {
//     public static void main (String[] args){
//         int rollno = 64;
//         char letter = "r";
//         float marks = 98.67f; // add f in last because :- all decimal value by defalut type :- double , so mention f to store it in float 
//         double large_decimals = 2367383788.978999;
//         long large_integer = 5782787282L; // add L in last because :- by defalut int 
//         boolean check = false ;

//     }
// }

//----------------------------------------------------------------------------------
public class First_program {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your roll no");
        int roll = input.nextInt();
        System.out.println("Your roll number is " + roll);
        String name = input.next();
        System.out.println(name);
        float marks = input.nextFloat();
        System.out.println(marks);
        


    }
}

// int a = 10 ; 
// in primitive data type :- 10 is a laiteral 
// a = identifier 


type casting and conversion 

