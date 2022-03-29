package org.example;
/*
* Write a method which will add elements in an array.
Remember that arrays are fixed in size so you need to come up with a
solution to “expand” the array.*/

import java.util.Arrays;

public class Ex9 {

    public static void main(String[] args) {
        int[] arr = new int[0];
        for(int i=0;i<12;i++)
            arr = addToArray(arr, i);

        System.out.println(Arrays.toString(arr));
    }
    public static int[] addToArray(int[] arr, int nrToadd){
        arr = Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1] = nrToadd;
        return  arr;
    }
}
