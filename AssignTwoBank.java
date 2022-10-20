package com.learn.test1;

public class AssignTwoBank {
    public static void main(String[] args){
        try {
            //case program to convert from upper case to lower case and vice versa of an alphabet
            //and print the old character and new character as shown in example (Ex: a->A, M->m).
            char c1='z';
            if (Character.isUpperCase(c1)){
                System.out.println(c1 + "->"+ Character.toLowerCase(c1));
            }
            else{
                System.out.println(c1 + "->"+ Character.toUpperCase(c1));
            }

            //program to print the color name, based on color code. If color code in not valid
            //then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow,
            //W->White.
            char clr='x';
            switch(clr){
                case 'R': {System.out.println("R->Red"); break;}
                case 'O': {System.out.println("O->Orange"); break;}
                case 'B': {System.out.println("B->Blue"); break;}
                case 'G': {System.out.println("G->Green"); break;}
                case 'Y': {System.out.println("Y->Yellow"); break;}
                default:
                    System.out.println("Invalid Code");
            }

            //Interest Problem
            //a program to accept gender ("Male" or "Female") and age (1-120) from command
            //line arguments and print the percentage of interest based on the given conditions.
            //Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
            //Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
            //8.3% Gender ==> Male Age ==>61-120
            String gender = args[0];
            int age = Integer.parseInt(args[1]);
            if ((age > 0 && age < 59) && gender.equals("Female")) {
                System.out.println("percentage of interest is 8.2%");
            } else if ((age > 58 && age < 121) && gender.equals("Female")) {
                System.out.println("percentage of interest is 7.6%");
            } else if (gender.equals("Male") && (age > 0 && age < 61)) {
                System.out.println("percentage of interest is 9.2%");
            } else if (gender.equals("Male") && (age > 60 && age < 121)) {
                System.out.println("percentage of interest is 8.3%");
            } else {
                System.out.println("Age should between 1-120 and gender should be Male/Female");
            }
        }
        catch(Exception ex){System.out.println(ex);}
    }
}
