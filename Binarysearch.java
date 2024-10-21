package com.example;

import java.util.Scanner;

public class Binarysearch {
    
    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // To avoid overflow

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid; // Return the index if target is found
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example sorted array
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        System.out.print("Enter the number you want to search for: ");
        int target = scanner.nextInt();

        // Call binarySearch method
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("The number " + target + " is not found in the array.");
        } else {
            System.out.println("The number " + target + " is found at index: " + result);
        }

        scanner.close();
    }
}

