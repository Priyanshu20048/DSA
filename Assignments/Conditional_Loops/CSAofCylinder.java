import java.util.Scanner;
public class CSAofCylinder{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Radius:- ");
        float r = sc.nextFloat();
        System.out.print("Enter Height :- ");
        float h = sc.nextFloat();
        double csa = 2*3.14*r*h;
        System.out.printf("Curved Surface Area of Cylinder :- %.2f",csa);

    }
}