import java.util.Scanner;
public class VolumeOfCone{
    public static void main(String [] args){
    Scanner in = new Scanner (System.in);
    System.out.print("Enter Height :- ");
    float h = in.nextFloat();
    System.out.print("Enter Radius:- ");
    float r = in.nextFloat();
    
    double  area = (1.0/3)*3.14*(r*r)*h;
    System.out.printf("Volume of Cone :- %.2f%n ",area);
    }
}