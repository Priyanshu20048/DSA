import java.util.Scanner;
public class VolumeOfPyramid{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Base Area :- ");
        float area = sc.nextFloat();
        System.out.print("Enter Height :- ");
        float h = sc.nextFloat();
        double volume = 1.0/3*area*h;
        System.out.printf("Volume Of Pyramid :- %.2f",volume);
    }
}