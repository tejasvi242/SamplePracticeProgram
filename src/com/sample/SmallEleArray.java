package com.sample;

public class SmallEleArray {
    public static void main(String[] args) {
        int [] arr = new int [] {20, 12, 37, 6, 86};               //Initialize min with first element of array.
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)                    //Loop through the array
        {
            if(arr[i] <min)                                      //Compare elements of array with min
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
