package com.learn.test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args){
//        given number is prime or not
        if(args.length==0){
            System.out.println("Please enter an integer number");
        }
        else{
            int primeNumber=Integer.parseInt(args[0]);
            if(primeNumber==0 || primeNumber==1){
                System.out.println(primeNumber+" is neither prime nor composite\n");
            } else {
                ExtractPrime(primeNumber);
            }
        }
        //Floyd's format
//        print * in Floyd's format
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("printing * for Floyd's format");
        if (num==0){
            System.out.println("Please enter an integer number");
        }
        else {
            for (int i = 1; i <= num; i++) {
//
                for (int j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
        //add all numbers and print
        int sum=0;
        int intLoop=1239874;
        for(int i=intLoop;i>0;i = i / 10){
            sum = sum + i % 10;
        }
        System.out.println(" sum of "+intLoop +" is "+sum);

        //17.reverse a given number and print
        int originalNum=10101,reversed = 0;;
        int reverseInt=originalNum;
        // run loop until num becomes 0
        while(reverseInt != 0) {
            // get last digit from num
            int digit = reverseInt % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            reverseInt /= 10;
        }
        System.out.println("Reversed Number is: " + reversed);
        //18.Palindrome
        if(originalNum==reversed){
            System.out.println("The given number is palindrome " + originalNum);
        }else{
            System.out.println("The given number is not palindrome " + originalNum);
        }
        //19.print first 5 values which are divisible by 2, 3, and 5.
        int fiveVal=1;
        List five=new ArrayList<>();
        while(five.size()<5){
            if(fiveVal%2==0 && fiveVal%3==0 && fiveVal%5==0){
                five.add(fiveVal);
                System.out.println(fiveVal);
            }

            fiveVal++;

        }
    }

    static void ExtractPrime(int primeNumber) {
        boolean flag=false;
        for (int i = 2; i <= primeNumber / 2; ++i) {
            // condition for nonprime number
            if (primeNumber % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(primeNumber + " is a prime number.");
        else
            System.out.println(primeNumber + " is not a prime number.");
    }
}
