package org.example;
/*
* Write a program which will set up an array to hold the next values in this
order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
Expected output: Average is: 17.3*/

import java.text.DecimalFormat;

public class Ex6 {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("##.##");
        int[] arr = {43,5,23,17,2,14 };
        double average=0;
        for(int nr: arr)
            average += nr;
        average = average/arr.length;
        System.out.println("Average: " + df.format(average));
    }
}
