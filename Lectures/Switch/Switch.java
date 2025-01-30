import java.util.Scanner;
public class Switch{
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    String fruit = in.next();
    // switch(fruit){
    //     case "Mango":
    //          System.out.println("King of Fruits");
    //          break;
    //     case "Apple":
    //         System.out.println("Keeps doctor away");
    //         break;
    //     case "Orange":
    //          System.out.println("Vitamin C");
    //          break;
    //     default :
    //          System.out.println("You are out of my range ");

    // } 
    // there is also an enhanced switch case 
    // it has in nuilt- break so dont need to mention 
switch(fruit){
    case "Mango" -> System.out.println("King of fruits");
    case "Apple" -> System.out.println("Doctor away");
    case "Orange" -> System.out.println("Vitamin C ");
    case "Banana" -> System.out.println("Shake");
    default -> System.out.println("Outof Rnage");
}
        
    }
    }

// cases have to be the same type as of expression 
// duplicate cases are not allowed 
// break is used to teminate the sequence 
// if break is not used , it will continue to next case 
// default will execute if none of the above does 
// if defaut is not in the end , put break after it 



    