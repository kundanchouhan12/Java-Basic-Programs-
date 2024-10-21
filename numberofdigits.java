package com.example;

public class numberofdigits {
    public static void main (String[] args) {
        int number = 12345;
        int originalNumber = number;  // Store the original number
        int count = 0;
 
        while (number > 0) {
            count++;  // Increment the count for each digit
            number = number / 10;  // Remove the last digit
        }
 
        System.out.println("The number of digits in " + originalNumber + " is: " + count);
    }
}
