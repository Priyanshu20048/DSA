import java.util.Scanner;
public class PeriOfRect{
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Length : ");
        float len = in.nextFloat();
        System.out.print("Enter Breadth : ");
        float bre = in.nextFloat();
        double Peri = 2 * (len +bre);
        System.out.printf("Perimeter of Rectangle : %.2f" ,Peri);


    }}