package com.learn.test1;

import java.util.*;

public class DemoHashMap {
    public static void main(String[] args){
        //hashMap
        Map<Integer,Integer> mydata = new HashMap<Integer,Integer>();
        mydata.put(2,33);
        mydata.put(3,33);
        mydata.put(4,33);
        mydata.put(null,33);
        mydata.put(2,67);
        Iterator it=mydata.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("LinkedHashMap");
        //LinkedHashMap:Same as HashMap nut maintains insertion order
        Map<Integer,Integer> myLinkedHashMap = new LinkedHashMap<>();
        myLinkedHashMap.put(89,33);
        myLinkedHashMap.put(3,33);
        myLinkedHashMap.put(4,33);
        myLinkedHashMap.put(null,33);
        myLinkedHashMap.put(2,67);
        Iterator itr=myLinkedHashMap.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("TreeMap");
        //LinkedHashMap:Same as HashMap nut maintains insertion order
        Map<Integer,Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put(89,33);
        myTreeMap.put(3,33);
        myTreeMap.put(4,33);
//        myTreeMap.put(null,33);
        myTreeMap.put(2,67);
        Iterator treeMap=myTreeMap.entrySet().iterator();
        while(treeMap.hasNext()) {
            System.out.println(treeMap.next());
        }
    }
}
