import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main( String [] args){
        Scanner sc = new Scanner (System.in);
   
        System.out.print("Enter Radius :- ");
        float r = sc.nextFloat();
        System.out.print("Enter Height :-  ");
        float h = sc.nextFloat();
        double volume = 3.14*r*r*h;
        System.out.printf("Volue Of Cylinder :- %.2f",volume);

    }
}