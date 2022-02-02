package com.sample;

public class SumOfNaturalNum {
    public static void main(String[] args)
    {
        int i, num = 40, sum = 0;

        for(i = 1; i <= num; ++i)        //executes until the condition returns true
        {
            sum = sum + i;               //adding the value of i into sum variable
        }
        System.out.println("Sum of First 20 Natural Numbers is = " + sum);
    }
}
