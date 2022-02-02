package com.sample;

public class StrCharCount {
    public static void main(String[] args)
    {
        String str= "Hello Sachin Mali";
        int count = 0;

        //Character count without Space
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters in the string
        System.out.println("Total number of characters in a string: " + count);
    }

}
