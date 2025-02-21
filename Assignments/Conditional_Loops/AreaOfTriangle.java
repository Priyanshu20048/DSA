import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Height");
        float height = sc.nextFloat();
       System.out.println("Enter Base");
        float base  = sc.nextFloat();
        float Area = 0.5f * base * height;
        System.out.println(Area);
    }
}
