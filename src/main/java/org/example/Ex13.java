package org.example;
/*Create two arrays with arbitrary size and fill one with random numbers.
Then copy over the numbers from the array with random numbers so
that the even numbers are located in the rear (the right side) part of the
array and the odd numbers are located in the front part (the left side). */

import java.util.Arrays;

public class Ex13 {

    public static void main(String[] args) {
        int[] arr1 = {12,4,3,34,456,55,35,7,1};
        int[] arr2 = new int[9];
        int[] even = new int[0];
        int[] odd = new int[0];

        for(int nr: arr1){
            if(nr%2==0){
                even = Arrays.copyOf(even, even.length+1);
                even[even.length-1] = nr;
            }else{
                odd = Arrays.copyOf(odd, odd.length+1);
                odd[odd.length-1] = nr;
            }
        }
        arr2 = Arrays.copyOf(odd, odd.length+even.length);

        for(int i=0;i< even.length;i++){
            arr2[i+ odd.length] = even[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}
