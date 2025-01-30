// Input currency in rupees and output in USD.
import java.util.Scanner;
public class Currency{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        float rup = in.nextFloat();
        float usd = rup * 86.63f;
        System.out.println(rup + " is equals to " + usd );

    }
}