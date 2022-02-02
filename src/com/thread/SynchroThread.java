package com.thread;

class SynThread {
        synchronized void printTable(int n){             //synchronized method
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }

        }
    }

    class MultiThread extends Thread{
        SynThread t;
        MultiThread(SynThread t){
            this.t=t;
        }
        public void run(){
            t.printTable(5);
        }

    }
    class MultiThread1 extends Thread{
        SynThread t;
        MultiThread1(SynThread t){
            this.t=t;
        }
        public void run(){
            t.printTable(100);
        }
    }

    public class SynchroThread {
        public static void main(String args[]) {
            SynThread obj = new SynThread();//only one object
            MultiThread t1 = new MultiThread(obj);
            MultiThread1 t2 = new MultiThread1(obj);
            t1.start();
            t2.start();
        }
    }
