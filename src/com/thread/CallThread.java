package com.thread;

    class CallThread extends Thread{
        public void run(){
            for(int i=1;i<5;i++){
                try
                {
                    Thread.sleep(500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
                System.out.println(i);
            }
        }
        public static void main(String args[]){
            CallThread t1=new CallThread();
            CallThread t2=new CallThread();

            t1.start();
            t2.start();
        }
    }