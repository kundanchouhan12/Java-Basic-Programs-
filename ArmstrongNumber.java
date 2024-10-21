package com.example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int result = 0;
        int numberOfDigits = Integer.toString(number).length();  // Calculate number of digits

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, numberOfDigits);  // Add each digit raised to the power of number of digits
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
