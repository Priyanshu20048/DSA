import java.util.Scanner;
public class Weekdays {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.next();
        switch(day){
            case "Monday" -> System.out.println(1);
            case ("Tuesday") -> System.out.println(2);
            case ("Wednesday") -> System.out.println(3);
            case("Thursday") -> System.out.println(4);
            case("Friday") -> System.out.println(5);
            case("Saturday") -> System.out.println(6);
            default -> System.out.println(7);
        }
    }
}