package org.example;

/*
*
4.  Write a program which will copy the elements of one array into another
array.
Expected output: Elements from first array: 1 15 20
Elements from second array: 1 15 20*/


import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {
        int[] arr1 = {1,15,20,35};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        for(int nr: arr2){
            System.out.print(nr+" ");
        }

    }
}
