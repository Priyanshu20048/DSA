import java.util.Scanner;
public class PeriOfEquiTriangle {
    public static void main(String [] args ){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Side : ");
        float side = in.nextFloat();
        double Area = 3 * side ;
        System.out.printf("Perimeter of Equilateral Triangle :%.2f",Area);

    }
}