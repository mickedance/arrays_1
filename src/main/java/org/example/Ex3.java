package org.example;
/*
* Write a program which will sort string array.
Expected output: String array: [Paris, London, New York, Stockholm]
  Sort string array: [London, New York, Paris, Stockholm]*/


import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
        String[] arr = {"Paris", "London", "New York", "Stockholm"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
