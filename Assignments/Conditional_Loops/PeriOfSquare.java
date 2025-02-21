import java.util.Scanner;
public class PeriOfSquare{
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Side of Square: ");
        float sq =  in.nextFloat();
        double Peri  = 4 * sq ;
        System.out.printf("Perimeter Of Square : %.2f\n ",Peri);

        
    }
}