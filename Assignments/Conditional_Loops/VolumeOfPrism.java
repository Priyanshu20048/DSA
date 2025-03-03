import java.util.Scanner;
public class VolumeOfPrism {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Base Area :- ");
        float area = in.nextFloat() ;
        System.out.print("Enter Height :- ");
        float h = in.nextFloat();
        double volume = area *h ;
        System.out.printf("Volume oF Prism :- %.2f ",volume);



   }
}