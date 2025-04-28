import java.util.*;
// public class FibonacciNo {
//  public static void main(String[] args) {
//    Scanner sc = new Scanner (System.in) ;
//    int n = sc.nextInt();
//    System.out.println(Fib(n));

//  }   
//  static int Fib(int n ){
//     int sum = 0;
//     int sum1 = 1;
//     int sum2 = 0;
//     for (int i=1; i <n;i++){
//         sum2 = sum1+sum;
//         sum = sum1;
//         sum1=sum2;
//     }
//     return sum2;

//  }

// }

// now doing it by recusion 
// formula for fibonacci no . 

// Fibo(n) =  Fibo(n-1) + Fibo(n-2);


// // ---------------Recursive Tree For Fibonacci Number -------
//                   Fibo(4)
//                 /         \
//             F(3)    +      F(2)
//             /  \         /      \
//          F(2) +  F(1)   F(1) +  F(0)
//          /  \
//      F(1) + F(0)

// breaking down into smaller problems :- you can use recurrence solution  
// the base conditions is represented by answers we already have
// for e.g :- in this case we know that F(0) = 0 & F(1) =1


public class FibonacciNo{
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in) ;
     int n = sc.nextInt();
     System.out.println(Fib(n));
   
    }
    static int Fib(int n){
        //base condition 
        if (n<2){
            return n ;
        }
     return Fib(n-1) + Fib(n-2);
        
    }
} 
// Last Function to be called :- Tail Recursion 

