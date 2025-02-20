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
// primitives are stored in stack memory 


//  AUTOMATIC TYPE CONVERSION
// you can have int in float type but not vice - versa 
// left side should be greater then right side (float > int )
// automatic type conversion for larger 

//  TYPE CASTING :- compressing the bigger no into smaller one explicitly
// int num = 67.86f -> ggives error 
// to converting float into num 
// int num = (int)(67.86f) -> gives 67

// AUTOMATIC TYPE PROMOTION  IN EXPRESSIONS 
// int a = 257 ; 
// byte b = (byte)(a);
// System.out.println(b) -> gives 1 // (257 % 256) because byte can hold upto 256 if we exceed it gives remainder 

// byte c = 40;
// byte d = 50 ;
// byte e = 100;
// int f = c*d/e;
// d -> 20 
// // ab jb c*d kiya toh answer = 2000 aaya but woh byte ki limit exceed kr chuka hai 
// // **** so how it is possible 
// // yaha java ne automatically  intermedita term  (c*d) ko int mei promote kr diya (in the expression )

// Rules for promotion :-
// 1. all the byte short and character values are promoted to integer 
// 2. if any  operand is longer then whole operation is promoted to longer one 
// 3. 

// Java follows Unicode 
// any character or any language can be printed (hindi also )


