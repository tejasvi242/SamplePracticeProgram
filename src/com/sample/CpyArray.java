package com.sample;

public class CpyArray {
    public static void main(String[] args) {
        int [] arr1 = new int [] {10, 20, 30, 40, 50};              //Initialize array
        int arr2[] = new int[arr1.length];                     //Create another array arr2 with size of arr1
        for (int i = 0; i < arr1.length; i++)                //Copying all elements of one array into another
        {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of original array: ");       //Displaying elements of array arr1
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.println("Elements of new array: ");                //Displaying elements of array arr2
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
