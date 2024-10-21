package com.example;

public class LinearSearchInString {
    public static int linearSearch(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;  // Return index if found
            }
        }
        return -1;  // Return -1 if not found
    }

    public static void main(String[] args) {
        String str = "Kundan";
        char target = 'd';

        int result = linearSearch(str, target);
        if (result != -1) {
            System.out.println("Character '" + target + "' found at index: " + result);
        } else {
            System.out.println("Character '" + target + "' not found.");
        }
    }
}
