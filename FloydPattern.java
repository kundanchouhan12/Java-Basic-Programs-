package com.example;

import java.util.Scanner;

public class FloydPattern {
    // Function to print Floyd's triangle
    public static void floydPatterns(int n) {
        int number = 1; // Start with 1
        for (int i = 1; i <= n; i++) { // Changed from i < n to i <= n
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Fixed variable name to lowercase
        System.out.print("Enter the number of rows for Floyd's triangle: ");
        int n = scanner.nextInt(); // Read the input number of rows
        floydPatterns(n); // Call the function to print the pattern
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
