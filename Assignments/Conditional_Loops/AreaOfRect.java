import java.util.Scanner;
public class AreaOfRect {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter Length:");
        float len = in.nextFloat();
         System.out.println("Enter Breadth:");
        float bre = in.nextFloat();
        float Area = len * bre ;
        System.out.println(Area);
        
    }
}