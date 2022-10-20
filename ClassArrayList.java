package com.learn.test1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ClassArrayList {
    public static void main(String[] args){

        //23.ArrayList which will be able to store only Strings
        List<String> mydata=new ArrayList<String>();
        mydata.add("45");
        mydata.add("bjk");
        mydata.add("ghjkl");
        mydata.add("rtyi");
        mydata.add("niljk");
        mydata.add("bil");
        // Displaying the list
        System.out.println("The list is: \n"
                + mydata);

        // Create an iterator for the list
        // using iterator() method
        printAll(mydata);
        //general looping of arraylist
        for (int i=0;i<mydata.size();i++){
            System.out.println(mydata.get(i));
        }
        //LinkedList
        List<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.add(54);
        myLinkedList.add(23);
        myLinkedList.add(null);myLinkedList.add(54);
        myLinkedList.add(54);
        for (int i=0;i<myLinkedList.size();i++){
            System.out.println(myLinkedList.get(i));
        }
    }

    //Create an ArrayList which will be able to store only Strings. Create a printAll method
    //which will print all the elements using an Iterator.
    private static void printAll(List<String> myData) {
        Iterator<String> iter = myData.iterator();

        // Displaying the values
        // after iterating through the list
        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
