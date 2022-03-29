package org.example;
/*Write a program that ask the user for an integer and repeat that
question until user give you a specific value that user already has been
told about as a message in your program. Store these values in an array
and print that array. After that reverse the array elements so that the
first element becomes the last element, the second element becomes
the second to last element, etc. Do not just reverse the order in which
they are printed. You need to change the way they are stored in the
array.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        int[] userInputs = new int[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("###--##");
        System.out.println("Enter a integer, if you enter number 10 you win!");

        boolean run = true;

        while(run){
            int nr =scanner.nextInt();

            if(nr==10){
                System.out.println("You won!");
                System.out.println("Before this you entered these number(s): "+ Arrays.toString(userInputs));
                run = false;
            }
            else {
                System.out.println("Please Try again!");
                userInputs = Arrays.copyOf(userInputs, userInputs.length+1);
                userInputs[userInputs.length-1] = nr;
            }
        }

    }
}
