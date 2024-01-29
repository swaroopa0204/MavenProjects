package collections1;

import java.util.HashMap;

public class TwoSum {

    public int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store the indices of numbers
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to achieve the target sum
            int complement = target - nums[i];
            // If the complement is present in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no such pair is found, return an empty array
        return new int[0];
    }
}

