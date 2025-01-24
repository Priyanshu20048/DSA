// count no.of 7 in a number 
import java.util.Scanner; 
public class RepetitionOfNo{
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int digit;
        int count = 0;
        while (num>0){
            digit = num%10;
            if (digit == 7){
                count ++;
            }
            num = num /10;

        }

System.out.println(count);

    }
}