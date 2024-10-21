package com.example;

public class ReverseArray {
    // Function to reverse the array
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements from start to end until the middle of the array is reached
        while (start < end) {
            // Swap array[start] and array[end]
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }

    // Main method to test the reverse function
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Call reverse function
        reverse(array);

        System.out.println("\nReversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
