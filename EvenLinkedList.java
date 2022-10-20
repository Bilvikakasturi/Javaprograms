package com.learn.test1;


import java.util.LinkedList;
import java.util.List;

public class EvenLinkedList {
    //Same as EvenArraylist program but LinkedList is used
    public static void main(String [] args){
        LinkedList<Integer> A3;
        A3=saveEvenNumbers(100);
        printEvenNumbers(A3);
        int x=(printEvenNumber(38));
        System.out.println(x);
    }
    public static LinkedList<Integer> saveEvenNumbers(int N){
        LinkedList<Integer> A1 = new LinkedList<>();
        for(int i=2;i<N;i++){
            if(i%2==0) {
                A1.add(i);
                System.out.println(i);
            }
        }
        return A1;
    }
    public static int printEvenNumber(int N){
        LinkedList<Integer> A1 = new LinkedList<>();
        A1=saveEvenNumbers(50);
        boolean num = A1.contains(N);
        if (num){
            return N;
        }
        else{
            return 0;}
    }
    public static LinkedList printEvenNumbers(LinkedList A1){
        LinkedList<Integer> A2 = new LinkedList<>();
        int val=2;
        for(int i=0 ; i<A1.size();i++){
            A2.add(val*Integer.valueOf(A1.get(i).toString()));
//            System.out.println(A1.get(i));
        }
        return A2;
    }
}
