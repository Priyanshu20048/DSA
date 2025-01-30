import java.util.Scanner;
public class Temp_conversion{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter temp in C :");
        float i = in.nextFloat();
        float f = (i*9/5) + 32;
        System.out.println(f);
        

    }
}