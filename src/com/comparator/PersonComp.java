package com.comparator;

import java.util.*;
import java.io.*;
    class PersonComp{
        public static void main(String args[]){
            ArrayList<Person> al=new ArrayList<Person>();
            al.add(new Person(10135,"Radhika",33));
            al.add(new Person(10605,"Aniket",27));
            al.add(new Person(10501,"Jai",21));

            System.out.println("Sort by Name");
            Collections.sort(al,new NameComp());
            for(Person pr: al)
            {                                 //Traversing the elements of list
                System.out.println(pr.adharno+" "+pr.name+" "+pr.age);
            }

            System.out.println("sorting by Age");
            Collections.sort(al,new AgeComp());
            for(Person pr: al)
            {                                           //Travering the list again
                System.out.println(pr.adharno+" "+pr.name+" "+pr.age);
            }

        }
    }
