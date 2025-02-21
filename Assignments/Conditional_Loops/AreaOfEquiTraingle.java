import java.util.Scanner;
public class AreaOfEquiTraingle{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Side : ");
        float side = in.nextFloat();
        double  Area = ( Math.sqrt (3) /4) * side * side;
        System.out.printf("Area Of Equiateral Triangle : %.2f%n " , Area); 
    }
}
// Breakdown of printf Format Specifiers:
// "%.2f" → Formats the floating-point number to 2 decimal places.
// %.2f%n → The %n is a platform-independent newline (works across Windows/Linux/Mac).
// area → The value to be formatted.
