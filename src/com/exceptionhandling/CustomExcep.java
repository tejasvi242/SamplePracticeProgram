package com.exceptionhandling;

    class InvalidAge extends Exception
    {
        public InvalidAge (String str)
        {
            super(str);                              // calling the constructor of parent Exception
        }
    }

    public class CustomExcep                 // class that uses custom exception
    {
        static void valid(int age) throws InvalidAge {
            if (age < 18)
            {
                throw new InvalidAge("Person is not valid for VOTING");
            } else
            {
                System.out.println("welcome to vote");
            }
        }

        public static void main(String args[])
        {
            try
            {
                valid(20);
            }
            catch (InvalidAge ex)
            {
                System.out.println("Catch the exception");
                System.out.println("Exception occured: " + ex);
            }
        }
    }

