package com.collection;

import java.util.*;
public class CollectionMap {

        public static void main(String args[]){
            HashMap<Integer,String> map=new HashMap<Integer,String>(); //Creating HashMap
            map.put(101,"Diamond");  //Put elements in Map
            map.put(102,"Mirror");
            map.put(103,"Mobile");
            map.put(104,"Mirror");

            System.out.println("Iterating Hashmap...");
            for(Map.Entry m : map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
