package com.sample;

public class CreateObj {
    void display() {
        System.out.println("Welcome to all");
    }

    public static void main(String[] args) {
        CreateObj obj = new CreateObj();        //create object using new keyword
        obj.display();                              //invoking method using the object
    }

}

