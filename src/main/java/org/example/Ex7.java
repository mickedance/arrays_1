package org.example;
/*
* Write a program which will set up an array to hold 10 numbers and print
out only the uneven numbers.
Expected output: Array: 1 2 4 7 9 12
Odd Array: 1 7 9*/

public class Ex7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        for(int nr: arr)
            if(nr%2!=0)
                System.out.println(nr);
    }
}
