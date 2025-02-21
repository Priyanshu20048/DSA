import java.util.Scanner;
public  class AreaOfParall{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        float length = in.nextFloat();
        float breadth = in.nextFloat();
        Float Area = length * breadth;
        System.out.println("Area Of Prallelogram : " + Area);
    }
}