import java.util.Scanner;

public class Max_in2D {
    public static void main (String[] args){
    System.out.println("Enter size of row :-");
    Scanner sc = new Scanner (System.in);
    int sz= sc.nextInt();
    int[][] arr = new int [sz][];
    for (int i = 0 ; i <arr.length;i++){
        System.out.println("Enter size of column  :");
        int col = sc.nextInt();
        for (int j = 0 ; j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for (int i = 0 ; i <arr.length;i++){
        for(int j = 0 ;j <arr[i].length; j++ ){
            System.out.println(arr[i][j]);
        }
        System.out.println();
    }

}}
