package org.example;
/*
* Write a program which will remove the duplicate elements of a given
array [20, 20, 40, 20, 30, 40, 50, 60, 50].
Expected output:                 Array: 20 20 40 20 30 40 50 60 50
                  Array without duplicate values: 20 40 30 50 60*/


import java.util.Arrays;

public class Ex8 {

    public static void main(String[] args) {
        int[] arr = {20,20,40,20,30,40,50,60,50};
        Arrays.sort(arr);
        int[] uniqueNr= new int[0];
        for(int i =0;i<arr.length;i++){
            if(i<arr.length-1){
                if(arr[i]!= arr[i+1]){
                    uniqueNr = Arrays.copyOf(uniqueNr, uniqueNr.length+1);
                    uniqueNr[uniqueNr.length-1] = arr[i];
                }
            }
            else {
                uniqueNr = Arrays.copyOf(uniqueNr, uniqueNr.length+1);
                uniqueNr[uniqueNr.length-1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(uniqueNr));

    }
}
