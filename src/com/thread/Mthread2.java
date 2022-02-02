package com.thread;

    public class Mthread2 implements Runnable
    {
        public void run()
        {
            System.out.println("Thread is in Running");
        }
        public static void main(String args[])
        {
            Runnable r1 = new Mthread2();                           // create object of the class Mthread2
            Thread th1 = new Thread(r1, "My new thread");      // create object of the class Thread using Thread(Runnable r, String name)
            th1.start();                                              // moves the thread to the active state
            String str = th1.getName();                               // get the thread name by invoking the getName() method
            System.out.println(str);
        }
    }
