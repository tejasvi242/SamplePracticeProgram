package com.sample;

public class RevStr {
        public static void main(String[] args) {
            String str = "Thank You";
            //Stores the reverse of given string
            String revStr = "";

            //Iterate through the string from last and add each character to variable reversedStr
            for(int i = str.length()-1; i >= 0; i--)
            {
                revStr = revStr + str.charAt(i);
            }

            System.out.println("Original string: " + str);
            //Displays the reverse of given string
            System.out.println("Reverse of given string: " + revStr);
        }
}
