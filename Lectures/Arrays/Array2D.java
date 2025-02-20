import java.util.Scanner;
public class Array2D{
    public static void main(String[] args){
        /*
          1 2 3 
          4 5 6
          7 8 9
                  */
    int[][] arr = new int [3][]; //no of rows is mandatory only , no of columns can be skipped 
    Scanner sc = new Scanner(System.in);
 // another method 
 int[][] arr = {
    {1,2}, // 0th index
    {4,5,6},// 1st Index
    {4,7,8,9}// 2nd Index
 }
 // arr.length :- gives the no of rows 
 // input 
 for (int row =0;row<arr.length;row++){
   // for each col in every row 
   for (int col=0;col<arr[row].length;col++){
      arr[row][col]=sc.nextInt();

   }}
   // output 
for (int row =0;row<arr.length;row++){
   // for each col in every row 
   for (int col=0;col<arr[row].length;col++){
      System.out.print(arr[row][col] + " ");
 }
    System.out.println();// for matrix form to print the elemnt to next kine after evry row
   
    }

    //a nother method
    for (int row =0;row<arr.length;row++){ 
      System.out.println(arrays.toString(arr[row]));
}
// enhanced for loop 
for (int[] a : arr){
   System.out.println(Arrays.toString(a))
}}
}
