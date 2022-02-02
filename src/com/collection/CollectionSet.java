package com.collection;
import java.util.*;

public class CollectionSet {
        public static void main(String args[]){
            HashSet<Integer> set=new HashSet<Integer>();
            set.add(101);
            set.add(102);
            set.add(103);
            set.add(101);
            Iterator<Integer> itr=set.iterator();            //Traversing elementss
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
