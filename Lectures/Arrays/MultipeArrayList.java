import java.util.Scanner;
public class MultipeArrayList{
    public static void main (String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialisation
        // if you dont initialise then by default value is null which will give you error 
        for (int i =0; i <3;i++){
            list.add(new ArrayList<>());
        }
        Scanner sc = new Scanner(System.in)
        
        // add elements
        for (int i=0;i <3;i++ ){
            for (int j =0;j<3;j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}