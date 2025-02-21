import java.util.Scanner;
public class PeriOfRhombhus{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side :");
        float side = in.nextFloat();
        double Peri = 4 * side ;
        System.out.printf("Perimeter of Rhombus : %.2f",Peri);
    }
}