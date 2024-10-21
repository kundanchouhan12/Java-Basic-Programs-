package com.example;
import java.util.Arrays;

public class BinarySearchInString {
    public static int binarySearch(char[] arr, char target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Return index if found
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;  // Return -1 if not found
    }

    public static void main(String[] args) {
        String str = "Kundan";
        char target = 'd';

        // Convert string to char array and sort it
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        int result = binarySearch(charArray, target);
        if (result != -1) {
            System.out.println("Character '" + target + "' found in sorted array at index: " + result);
        } else {
            System.out.println("Character '" + target + "' not found in the sorted array.");
        }
    }
}

