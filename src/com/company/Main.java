package com.company;
import java.util.Scanner;

public class Main {

    public static void getCubedNumber() {
        Scanner scnr = new Scanner(System.in);      //Setting up scanner

        // Initializing variables
        int userInput = 0;
        int inNum = 0;
        int cubedNum = 0;
        int finalNum = 0;
        int tempHold = 0;

        //Getting number from user and printing out what user typed in.
        System.out.println("Please enter a positive integer.");
        userInput = scnr.nextInt();
        System.out.println("Your number is: " + userInput);

        //Using a temporary variable to hold on to userInput
        tempHold = userInput;

        // Getting each digit separate, so program can cube each and add them all together
        while (userInput > 0) {
            inNum = userInput % 10;
            userInput = userInput / 10;
            cubedNum = inNum * inNum * inNum;
            finalNum = finalNum + cubedNum;
        }

        //Printing out what the digits are cubed
        System.out.println("Your number with each digit cubed is: " + finalNum);

        //if statement to see if the userInput is the same as the cubed number
        if (tempHold == finalNum) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        return;
    }

    public static void main(String[] args) {

        //Print statement to say what the app does
        System.out.println("Welcome. This app will tell you if the number you give, when each digit is cubed and added together will equal the number you gave.");

        // Calling the method to find get number and cubed it.
        getCubedNumber();
    }
}