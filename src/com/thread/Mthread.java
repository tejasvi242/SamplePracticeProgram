package com.thread;

public class Mthread extends Thread {
    public void run()
    {
        System.out.println("Thread is in running State");
    }
    public static void main(String args[])
    {
        Mthread mt= new Mthread();
        mt.start();
    }


}
