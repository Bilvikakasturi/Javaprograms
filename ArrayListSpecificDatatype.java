package com.learn.test1;

import java.util.ArrayList;
import java.util.List;
class MyNewArrayList<E> extends ArrayList<E>{
    @Override
    public boolean add(E e){
        if(e instanceof Integer || e instanceof Double || e instanceof Float){
            super.add(e);
            return true;
        }
        else{
            throw new ClassCastException("It only allows Integer, Float, and Double to add.");
        }
    }
}
public class ArrayListSpecificDatatype {
    //Collections--4.ArrayList which will be able to store only numbers like int,float,double,etc
    public static void main(String [] args){
        List<Object> myList = new MyNewArrayList();
        try {
            myList.add(54);
            myList.add(54.2F);
            myList.add(54.04);
            myList.add("bil");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(myList);
        }


    }
}
