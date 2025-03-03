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

   // ✅ Option 1: Taking input dynamically for a jagged array
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][]; // Only row size is fixed

        // Input for jagged array
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols]; // Allocate column size dynamically

            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


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

// Why Use Arrays.deepToString(arr)?
// Understanding Arrays.toString(arr) vs. Arrays.deepToString(arr)
// In Java, Arrays.toString(arr) works only for 1D arrays.
// When used on a 2D array, it prints memory references instead of the actual elements.


