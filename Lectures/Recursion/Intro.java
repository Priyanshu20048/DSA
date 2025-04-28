// // write a ufnction that prints helo worls 
// import java.util.*;
// public class Intro{
//     public static void main(String[] args){
//         message();
//     }
// public static void message(){
//         System.out.println("Hello , my name is Priyanshu");
//       }
// }

// // now i want to print it 5 times 
// // what are you approach ?
// either call the function 5 times or modify the message () function and write their 5 times 
// // but what if I dont want to change the strcture of function 
// then you can do that create some more functions with different name but same body 
// and call each other in different function like this

// write a ufnction that prints helo worls 
import java.util.*;
public class Intro{
    public static void main(String[] args){
        message();
    }
public static void message(){
        System.out.println("Hello , my name is Priyanshu");
        message1();
      }
    
      public static void message1(){
        System.out.println("Hello , my name is Priyanshu");
        message2();
      }

      public static void message2(){
        System.out.println("Hello , my name is Priyanshu");
        message3();
      }
      public static void message3(){
        System.out.println("Hello , my name is Priyanshu");
        message4();
      }
      // function body here changes 
      public static void message4(){
        System.out.println("Hello , my name is Priyanshu");
      }
}
// now here the function will execute and it will call other functionn 

// all the functon calls that happen in programming -> they go into stack memory 

// --------------------------------------------------------
how function call works in language 
1. while the functio is not finished executing , it will remain in stack 
2. when a function finishes it executing , it is removed from stack
 and the flow of program is restored to where that function was called . 
3. when the last function (main ), function is removed from the stack , the program ends






