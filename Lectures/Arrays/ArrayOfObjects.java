import java.util.Scanner;
public class ArrayOfObjects{
    public static void main(String[] args){
        String[] arr = new String [3];
         Scanner in = new Scanner(System.in);
        for (int i =0 ;i < arr.length;i++){
           arr[i]=in.next();
        }
    }
}