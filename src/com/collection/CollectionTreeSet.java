package com.collection;

import java.util.*;
class CollectionTreeSet {
        public static void main(String args[]){
            TreeSet<Integer> set=new TreeSet<Integer>();
            set.add(333);
            set.add(222);
            set.add(111);
            set.add(444);
            set.add(555);
            System.out.println("Traversing element");
            Iterator i=set.iterator();
            while(i.hasNext())
            {
                System.out.println(i.next());
            }
            System.out.println("Initial Set: "+set);

            System.out.println("Reverse Set: "+set.descendingSet());

            System.out.println("Head Set: "+set.headSet(333));

            System.out.println("SubSet: "+set.subSet(111,555));

            System.out.println("TailSet: "+set.tailSet(444));

            System.out.println("Highest Value: "+set.pollLast());

            System.out.println("Lowest Value: "+set.pollFirst());

        }
    }
