package com.example;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int number = scanner.nextInt(); // Read the number

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number."); // Output if the number is prime
        } else {
            System.out.println(number + " is not a prime number."); // Output if the number is not prime
        }

        scanner.close(); // Close the scanner
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check for factors up to the square root of num
            if (num % i == 0) {
                return false; // If num is divisible by i, it's not prime
            }
        }
        return true; // If no factors are found, num is prime
    }
}
