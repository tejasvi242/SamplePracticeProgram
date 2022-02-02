package com.exceptionhandling;

public class ArithException {
        public static void main(String args[]){

            try {
                int d=56/0;                                    //In try block
                System.out.println(d);
            }
            catch(ArithmeticException e)                        //handles the Arithmetic Exception
            {
                System.out.println("Exception handle");
                System.out.println(e);
            }
            finally                                              //Always executed
            {
                System.out.println("finally block is always executed");
            }
    }
}
