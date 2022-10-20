package com.learn.test1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

public class DemoPriorityQueue {
    public static void main(String[] args){
        //PriorityQueue
        Queue<Integer> mypriorityQ= new PriorityQueue<Integer>();
        mypriorityQ.add(87);
        mypriorityQ.add(1);
        mypriorityQ.add(67);
        mypriorityQ.add(987);
        mypriorityQ.add(87);
        Iterator itr=mypriorityQ.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("...");
        //returns head element
        System.out.println(mypriorityQ.peek());
        System.out.println("...");
        //returns head element and removes it
        System.out.println(mypriorityQ.poll());
        System.out.println("...");
        Iterator itr1=mypriorityQ.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
