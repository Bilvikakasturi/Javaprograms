package com.learn.test1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class DemoExceptionAndVector {
    public static void main(String args[])
    {
        //Indexoutofboundexception/unchecked
        try{
            //Vector
            Vector vec=new Vector(3);
            vec.add(33);
            vec.add(33);
            vec.add(33);
            vec.add(33);
            vec.add(33);
            vec.add(33);
            vec.add(33);
            System.out.println(vec.capacity());
            System.out.println(vec.size());
            int[] arr={0,1,2};
            int[] x=new int[4];
            x[0]=1;
            x[1]=1;
            x[2]=1;
            x[3]=1;
            x[4]=5;

            for (int i = arr.length; i > 0; i--) {

                System.out.println(arr[i]);
                System.out.println(" ");

            }

        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        //NumberFormatException/unchecked
        try{
            Integer.parseInt("bil") ;
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        //IOException(checked)
        try
        {
            FileReader file = new FileReader("/Users/bilvikakasturi/Documents/JAVA_Training/Java_theory.rtf");
            file = null;
            file.read();
        }
        //NullPointerException/unchecked
        catch(NullPointerException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try
        {
            FileReader file = new FileReader("xys.rtf");
        }
        //FileNotfoundException
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        //unchecked--nullpointer,NumberFormatException,Indexoutofboundexception,Arithemetic,illegalthread
        //checked--interrupted,SQlexception,classnotfoundexception,ioexception,filenotfound

    }
}
