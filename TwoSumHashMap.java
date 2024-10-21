package com.example;
import java.util.HashMap;

public class TwoSumHashMap {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find complement of current number
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices of the two numbers
            }
            map.put(nums[i], i); // Store current number with its index
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
