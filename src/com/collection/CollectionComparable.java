package com.collection;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
    int empid;
    String name;
    int age;
    Employee(int empid,String name,int age){
        this.empid=empid;
        this.name=name;
        this.age=age;
    }
    /*public int compareTo(Employee em){
        if(age==em.age)
            return 0;
        else if(age<em.age)
            return 1;
        else
            return -1;
    }*/
    public int compareTo(Employee em) {
        if (empid == em.empid)
            return 0;
        else if (empid > em.empid)
            return 1;
        else
            return -1;
    }
   /* public int compareTo(Employee em)
    {
        return name.compareTo(em.name);
    }*/
}
public class CollectionComparable{
    public static void main(String args[]){
        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee (101,"Jayashree",34));
        al.add(new Employee(106,"Suresh",29));
        al.add(new Employee(105,"Ajay",37));

        Collections.sort(al);
        for(Employee em:al){
            System.out.println(em.empid+" "+em.name+" "+em.age);
        }
    }
}