package org.example;
/*
* Write a program which will represent multiplication table stored in
multidimensional array.
Hint: You have two-dimensional array with values
[[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]*/


public class Ex10 {

    public static void main(String[] args) {
        int[][] table = new int[10][10];

        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                table[i][j] = (i+1) * (j+1);
            }
        }
        for(int i=0;i<table.length;i++){
            System.out.println("");
            for(int j=0;j<table[i].length;j++){
                String s = "";
                if(table[i][j]<10)
                    s= " ";
                System.out.print( table[i][j] + " "+s);
            }
        }
    }
}
