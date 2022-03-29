package org.example;
/*Write a program which will print the diagonal elements of two-
dimensional array.
Expected output: 1 4 9*/

public class Ex12 {

    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = (i+1)*(j+1);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][i]);
        }
    }
}
