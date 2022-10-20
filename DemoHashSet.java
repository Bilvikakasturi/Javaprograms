package com.learn.test1;

import java.util.*;

public class DemoHashSet {
    public static void main(String[] args){
        //HashSet
        System.out.println("Hashset");
        Set<Integer> mydata=new HashSet<Integer>();
        mydata.add(87);
        mydata.add(56);
        mydata.add(null);
        mydata.add(null);
        mydata.add(55);
        Iterator iterator=mydata.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //LinkedHashset
        System.out.println("LinkedHashset");
        Set<Integer> mylinkhash=new LinkedHashSet<>();
        mylinkhash.add(87);
        mylinkhash.add(56);
        mylinkhash.add(null);
        mylinkhash.add(null);
        mylinkhash.add(55);
        Iterator itr=mylinkhash.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        //Treeset
        System.out.println("Treeset");
        Set<Integer> mytreeset=new TreeSet<>();
        mytreeset.add(100);
        mytreeset.add(56);
        mytreeset.add(56);
        mytreeset.add(4);
        mytreeset.add(55);
        Iterator itrtree=mytreeset.iterator();
        while(itrtree.hasNext()){
            System.out.println(itrtree.next());
        }
    }
}
