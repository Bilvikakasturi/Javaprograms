package com.learn.test1;

import java.io.Console;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AssignmentTwo {
    public static void main(String[] args){
        //a program to check if a given number is Positive, Negative, or Zero.
        Scanner sc1= new Scanner(System.in);
        System.out.print("Enter a number to determine if numebr is +ve or -ve or zero: ");
        // integer input
        int number = sc1.nextInt();
        if (number==0){
            System.out.println("number is zero");
        } else if (number>0) {
            System.out.println("number is positive");
        }
        else{
            System.out.println("negative");
        }

        //a program to check if a given number is odd or even.
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter a number to determine odd or even: ");
        // integer input
        int number2 = sc2.nextInt();
        if (number2%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
//Write a program to check if the program has received command line arguments or not.
//If the program has not received the values then print "No Values", else print all the
//values in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2)
//java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length
//property of an array to check its length
        //To check command line arguments
        if (args.length == 0) {
            System.out.println("No Values");
        }
        else{
            System.out.println(Stream.of(args).collect(Collectors.joining(",")));
        }

//Initialize two character variables in a program and display the characters in alphabetical
//order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
//second is e O/P:a,e
        //characters in alphabetical order.
        char s1='z';
        char s2='f';
        if(s1>s2){
            System.out.println(s2+","+s1);
        }
        else{
            System.out.println(s1+","+s2);
        }
        //print
        //"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
        //Character"
        char digitAlpha='6';
        if(Character.isDigit(digitAlpha)){
            System.out.println("its a digit");
        } else if (Character.isAlphabetic(digitAlpha)) {
            System.out.println("its alphabet");
        }
        else{
            System.out.println("Its neither char nor alphabet");
        }
    }
}
