import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args){
        float pi = 3.14159f;
        Scanner sc = new Scanner (System.in);
        float radius = sc.nextFloat();
        float Area = pi * (radius * radius);
        System.out.println(Area); 
    }
}