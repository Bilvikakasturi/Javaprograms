package com.learn.test1;

public class Initials {

    public static void main(String[] args) {
        //print hellowworld 10 times!!
        for (int i=0;i<=10;i++){
            System.out.println("Hello world!!");
        }
        //priniting my initial
        System.out.println("**        ***    *********     ");
        System.out.println("**      ***      **       **   ");
        System.out.println("**    ***        **         **  ");
        System.out.println("**  ***          **       **    ");
        System.out.println("*****            **  ** **      ");
        System.out.println("**  ***          **       **     ");
        System.out.println("**    ***        **         **  ");
        System.out.println("**      ***      **        **   ");
        System.out.println("**        ***    **********     ");
        //print names in reverse order
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.print(args[1]);
        System.out.print(args[2]);
        String s=args[0];
        String x=args[1];
        String y=args[2];
        String [] arr = {s,x,y};
        System.out.println(" ");
        System.out.println("Hi");
        for (int i = arr.length; i > 0; i--) {

            System.out.println(arr[i-1]);
            System.out.println(" ");
        }
    }


}
