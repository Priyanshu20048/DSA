import java.util.Scanner ;
public class Employ{
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int empid = in.nextInt();
        String dep = in.next();
        switch (empid){
            case 1 :
                System.out.println("Priyanshu");
                break;
                case 2:
                    System.out.println("Priyanka");
                    break;
                case 3 :
                    System.out.println("Ravneet");
                    switch (dep){
                        case "IT":
                            System.out.println("Information Technology");
                            break;
                            case "Management":
                                System.out.println("Managment Department");
                                break;
                            case "Pantry":
                                System.out.println ("Pantry Department");
                                break;
                                default :
                                System.out.println ("No department enterd");

                    }
                    break;
                    default :
                    System.out.println("Wrong employ id ");
                    }
        }


        
    }
