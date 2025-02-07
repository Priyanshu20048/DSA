import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
         boolean num3 = num(a);
        if (num3 == true){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

    }
    static boolean num(int b){
        for (int i = 2 ; i < b;i++){
            if (b%i == 0) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}