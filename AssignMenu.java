package com.learn.test1;

import java.util.Scanner;

public class AssignMenu {
    public static void main(String[] args) {
    //a program that displays a menu with options 1. Add 2. Sub Based on the options
        //chosen, read 2 numbers and perform the relevant operation. After performing the
        //operation, the program should ask the user if he wants to continue. If the user presses y
        //or Y, then the program should continue displaying the menu else the program should
        //terminate
        char choose;
        do {
            System.out.println("Please choose from below options");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            Scanner s1 = new Scanner(System.in);
            int opt = s1.nextInt();
            System.out.println("Please enter two numbers for ADD/Subtract");
            Scanner s2 = new Scanner(System.in);
            int num1 = s2.nextInt();
            Scanner s3 = new Scanner(System.in);
            int num2 = s3.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Addition of " + num1 + " and " + num2 + "is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Subtraction of " + num1 + " and " + num2 + "is: " + (num1 - num2));
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
            System.out.println("Do you want to continue??");
            Scanner s4 = new Scanner(System.in);
            choose = s4.next().charAt(0);
        } while (choose == 'y' || choose=='Y');

    }
}
