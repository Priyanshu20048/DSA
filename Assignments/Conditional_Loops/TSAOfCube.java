import java.util.Scanner;
public class TSAOfCube {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter side :- ");
        float side = sc.nextFloat();
        double area = 6*side *side ;
        System.out.printf("Total Surface Area Of Cube :- %.2f",area);



    }
}