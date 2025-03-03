import java.util.Scanner;
public class VolumeOfSphere{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Radius :- ");
        float r = sc.nextFloat();
        double volume = (4.0/3)*3.14*r*r*r;
        System.out.printf("Volume Of Sphere :- %.2f",volume);
    }
}