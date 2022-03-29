package org.example;
/*Create two arrays with arbitrary size and fill one with random numbers.
Then copy over the numbers from the array with random numbers so
that the even numbers are located in the rear (the right side) part of the
array and the odd numbers are located in the front part (the left side). */

import java.util.Arrays;

public class Ex13 {
    // java doc
    public static void main(String[] args) {
        int[] arr1 = {33,1,34,546,665,4,8,65,9};
        int[] arr2 = new int[arr1.length];

        int back = arr1.length-1;
        int front =0;

        for(int i=0;i< arr1.length;i++){

            if(arr1[i]%2==0){
                //Even
                arr2[back] = arr1[i];
                back--;
            }else{
                arr2[front] = arr1[i];
                front++;
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
}
