package com.collection;
import java.util.*;

public class CollectionArray {
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();            //Creating arraylist
            list.add("Rose");                                 //Add object in arraylist
            list.add("Lily");
            list.add("Tulip");
            list.add("Orchid");
//Traversing list through Iterator
           Iterator itr=list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
