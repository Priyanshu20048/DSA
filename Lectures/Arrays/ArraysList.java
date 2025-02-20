// when we dont know thw size of array 
// you just want to thatbhey java plaese handle the size for me and ley me ener the no fo elemnst i want 
// similar to vector in c/c++
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArraysList {
    public static void main(String[] args){
    // Synatx :-
    ArrayList<Integer> list = new ArrayList<>(10);
    // <Integer> :- data type // yu can skip this but not a good practice 
    // you cannot enter primitives in it , you can only have rapper class 
    // you cnat use like this <int>
    // here list is a  reference variable
    // here 10 is initail capacaity  
    list.add(567);
    list.add(78);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    list.add(56);
    // you can add as many as you want even more than 10 
   
    list.contains(345);// it will check if the list contains 345or not :Answer will be boolean 
    
    // chang value in list 
    list.set(0,99);
     System.out.println(list);
     
     // remove 
     list.remove(2);//here 2 is index
     System.out.println(list);
  Scanner sc = new Scanner(System.in);

// taking input 
for (int i =0;i<10;i++){
    list.add(sc.nextInt());
}

// get item at any index 
for (int i =0;i<10;i++){
    System.out.println(list.get(i));// pass index here ,list[index] will not wrk here 
}


    }
}
// Internal working of List 
// 1. size is actually fixed internally
// 2. when your arraylist fill by some amount then:-
//  it will create a new array list of double the size 
//  and the old elements are copied into the new list 
//  and the old one is deleted