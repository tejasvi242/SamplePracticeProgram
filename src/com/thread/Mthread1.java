package com.thread;

class Mthread1 implements Runnable {
    public void run()
    {
        System.out.println("Thread is in Running State..");
    }
    public static void main(String args[])
    {
        Mthread1 mt=new Mthread1();
        Thread t=new Thread(mt);   //Constructor thread(Runnable r)
        t.start();
    }
}
