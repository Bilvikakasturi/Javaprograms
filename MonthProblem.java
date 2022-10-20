package com.learn.test1;

public class MonthProblem {
    //a program to print month in words, based on input month in numbers Example1
    public static void main(String[] args){
        //printing months
        String[] s = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December","Invalid month"};
        if (args.length==0){
            System.out.println("Please enter the month in numbers");
        } else  {
            int n=Integer.parseInt(args[0]);
            if(n>=1 && n<=12)
                System.out.println(s[n-1]);
            else
                System.out.println(s[12]);
        }
        //numbers from 1 to 10 in a single row with one tab space
        for(int i=1;i<11;i++){
            System.out.print(i);
            System.out.print("  ");
        }
        System.out.println("");
        //even numbers between 23 and 57 each number should be
        //printed in a separate row.
        for (int i=23;i<58;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        //given number is prime or not
        int primeNum = 17;
        PrimeOrNot.ExtractPrime(primeNum);

        //Prime numbers between 10 and 99
        for(int n=10;n<100;n++){
            boolean flagOne=false;
            for (int i=2;i<=n/2;++i){
                if(n%i==0){
                    flagOne=true;
                    break;
                }
            }
            if(!flagOne)
                System.out.println(n+"is a prime");
        }
    }
}
