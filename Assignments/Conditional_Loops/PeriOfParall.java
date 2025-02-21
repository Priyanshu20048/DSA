import java.util.Scanner;
public class PeriOfParall{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Base: ");
        float base = in.nextFloat();
        System.out.print("Enter Side: ");
        float side = in.nextFloat();
        double Peri = 2 * (base + side );
        System.out.printf("Permeter of Parallelogram : %.2f",Peri);
    }
    }
