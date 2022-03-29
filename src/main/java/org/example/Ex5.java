package org.example;
/*
* Create a two-dimensional string array [2][2]. Assign values to the 2d
array containing any Country and City.
Expected output:  France Paris
Sweden Stockholm*/


public class Ex5 {

    public static void main(String[] args) {
        String[][] arr = new String[2][2];
        arr[0][0] = "France";
        arr[0][1] = "Paris";
        arr[1][0] = "Sweden";
        arr[1][1] = "Stockholm";

        for(String[] str: arr){
            for(String s: str){
                System.out.print(s+" ");
            }
            System.out.println("");
        }
    }
}
