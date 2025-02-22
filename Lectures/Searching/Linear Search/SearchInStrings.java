import java.util.Scanner;
import java.util.Arrays;
public class SearchInStrings{
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);

       System.out.print("Enter Your Name :- ");
       String name = sc.next();

       System.out.print("Enter Character :- ");
       char  c = sc.next().trim().charAt(0);

       boolean  ans = Search(name,c);
       System.out.println(ans);
       }

       static boolean Search(String names,char d ){
        if (names.length() == 0){
            return false;
        }
        for (int i = 0; i < names.length();i++){
            if (d == names.charAt(i)){
              return true;
            }
        }
        return false;
       }
       

    
}
