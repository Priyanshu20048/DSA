import java.util.Scanner;
public class Greetings{
   public static void main(String [] args){
     greet();
    //   String personalised = myGreet("Priyanshu");
    //  System.out.println(personalised);
    
     // taking input from user
     Scanner in = new Scanner (System.in);
     String names =in.next();
      String personalised = myGreet(names);
     System.out.println(personalised);
   } 

   static void greet(){
    System.out.println("Hi everyone ");
   }

   static String myGreet(String name){
    String message = "Hello "+ name;
    return message ;
   }
}
// passig value 
