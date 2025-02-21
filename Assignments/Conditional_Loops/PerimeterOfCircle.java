import java.util.Scanner;
public class PerimeterOfCircle{
    public static void main(String[] args){
        System.out.print("Enter Radius Of Circle : ");
        Scanner in = new Scanner(System.in);
        float rad = in.nextFloat();
        double Area = 2 * 3.14 * rad ;
        System.out.printf("Perimeter Of Circle :%.2f",Area);

    }
}