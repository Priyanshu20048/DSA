// in java functions are called methods
// function in class are called methods  
// import java.util.Scanner ;
// public class Sum {
//     public static void main (String[] args) {
//         sum2();

//     }

//  static void sum2() {
//     Scanner in = new Scanner (System.in);
//     System.out.print("enter number 1 : ");
//     int num1 = in.nextInt();
//     System.out.print("enter number 2 : ");
//     int num2 = in.nextInt();
//     int summ = num1 +num2;
//      System.out.print("sum is " + summ);




// }}

// retrun the value 
// static int sum3() {
//     Scanner in = new Scanner (System.in);
//     System.out.print("enter number 1 : ");
//     int num1 = in.nextInt();
//     System.out.print("enter number 2 : ");
//     int num2 = in.nextInt();
//      System.out.print("sum is " + num1+num2);

// }
// // structure of function  
// /*  access modifier return type name(){
//      body 
//      return statement;
//      }*/

// // What is return type 
// // it is the valuse that the function call holds . it is the value that the function gives after its execution 
// nothing will execute after this 

// the return should be same as mentioned
//---------------------------------------------------------------------

// ARGUMENTS :- 
// pass the value of numbers when you are calling the method in main()
// Yo cannot skip any argument;
// order of the arguments matter 
import java.util.Scanner ;
// public class Sum {
//     public static void main (String[] args) {
//         int ans = sum2(3,4);
//         System.out.println(ans);

//     }

//  static int sum2(int a,int b) {
    
//     int summ = a+b;
//     //  System.out.print("sum is " + summ);
//     return summ;
// }}
//-----------------------------------------------------------------------------------------------------

// Internal Structure of function 
// public class Sum {
//     public static void main (String[] args) {
//         String name = "Priyanshu";
//         changename(name);
//         System.out.println(name);// here the value of name is passed 
//         // there is pass by value in primitives 
//         // no pass by refernce in java 
//         // in non primitives :-  the references copy is passed;

//         System.out.println(naam);
//         // this will give you an error because naam is available only to cahngename function ,you cant accesss it outside the function 
//         }
//     static void changename(String naam){// here it cn be anything jrrori nhi ki woh name(variable name jese yaha naam hai ) hi ho 
//         naam = "Bharti Mittal";
//     }
// }// this function will not change the name because now naam is pointing toward different object and name is still pointing towards Priyanshu
// // any change in naam will also reflect a change in name 
// // here it is not happening because you are not changig name , you are making the naam  pointing towards different object ;
// another reason :- strings are immutable 
// --------------------------------------------------------------------------------------------------------------------------------------
// example where value is changes 
import java.util.Arrays;
public class Sum {
    public static void main (String[] args) {
        int [] arr = {1,2,3,45,6};
        change(arr);// here the copy of the refernce variable is passed
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;// changes made at nums will also be reflected in arr because both are pointing towards the same 
    }}
    
//--------------------------------------------------------------------------------------------------------
// scoping :- 
1. Function Scope :-you can acces the variable only within its function  
2. Block Scope :- 
e.g :- public class Sum {
//     public static void main (String[] args) { 
  int a =10;
  int b = 20;
  {
    a = 67;
    int c = 20;
  }
  System.out.println(c);
 
  // now you cannot access c outside its block 
  // values initialised in this block will remain in block and it can be reinitialised outside the block 
  // if some value is aready initialised outside the block in the same method , you  cannot initialise it again ;
  // but you can change its original value 
  // and it will work outside the block also
  // for loop  also has block scope 

}
//-----------------------------------------------------------------------------------------------------------------------------------
// Shadowing :- practice of using 2 variablea with the same name within the scope that overlaps
eg:- public class Sum {
    static int  x = 90; // this will be shadowed at line 126
    public static void main (String[] args) {
System.out.println(x) // print 90
int x = 30;
System.out.println(x) // print 30
fun();}// print 90
static void fun(){
    System.out.println(x);
}}
// the variable with a higher level scope is hidden
// scope will begin when value is initialise d
// if you try to access the value between its declaration and initialisation it will give you an error 
//---------------------------------------------------------------------------------------------------------------------------------------------
// Variable Length Arguments :- when we dont know how many inputs are we giving 
// length is varying 
 public class VarArgs{
    public static void main(String[] args){
        fun(2,3,4,5,67,8,9,4,5);

    }
    static void fun(int  ...v){// this will iternally store it  as an array of integers 
  System.out.println(Arrays.toString(v));

    }
 }
 //--------------------------------------------------------------------------------------------------------------------------------
 // Mix of Arguments 
 // Variable length Arguments must be last in the list
  static void multiple(int a ,int b,String...v);{

  }
  // ------------------------------------------------------------
  Function Overloading :- 
  2 or more functions of the same name can exist with different parameters can exist 
  // either the type of arguments should be different or the type should be different 
  // function overloading, runs at compile time, it will decide which function to run 
  public class Overloading {
    public static void main(String[] args){
        fun(45);
        fun("priyanshu"); 
        int ans = sum(3,4);
        System.out.println(ans);
        int ans2 = sum(3,4,5);
         System.out.println(ans2);

    }
    static int sum(int num1,int num2){
        return num1+num2;
    }
    static int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    static void fun(int a ){
        System.out.println(a);

    }
    static void fun ( String b){
        System.out.println(b);

    }
  }
  function Overloading in Var args 
  public class Overloading {
    public static void main(String[] args){
        multiple(2,3,"Kunal","rahul","fhg");
        demo(2,3,4);
        demo("Kunal","Rahul");
        // what if i dont add anything in demo 
        demo();// this will cause an error 
        // this is called AMBIGUITY 
        // here it cannnot decide which is needed to run 

    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
         System.out.println(Arrays.toString(v));
    }
  }
  





