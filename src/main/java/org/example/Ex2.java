package org.example;
/*
* Create a program and create a method with name ‘indexOf’ which will
find and return the index of an element in the array. If the element
doesn’t exist your method should return -1 as value.
Expected output: Index position of number 5 is: 2.*/

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr= {0,3,7,4,5,11,32    };
        int nrToFind = 5;
        System.out.println("index is: "+indexOf(arr, nrToFind));
    }

    public static int indexOf(int[] arr, int nrTofind) {

        return  Arrays.binarySearch(arr, nrTofind);
    }
}
