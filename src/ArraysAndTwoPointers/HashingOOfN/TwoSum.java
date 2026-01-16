package ArraysAndTwoPointers.HashingOOfN;

// https://leetcode.com/problems/two-sum/description/

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//        Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
//
//
//Constraints:
//
//        2 <= nums.length <= 104
//        -109 <= nums[i] <= 109
//        -109 <= target <= 109
//Only one valid answer exists.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result =twoSum(new int[]{2, 11, 7, 15}, 9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store (value, index) pairs
        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            // If the complement is in the map, we found our pair
            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            // Otherwise, store the current number and its index
            prevMap.put(num, i);
        }

        // Return an empty array if no solution is found (per problem constraints, this won't happen)
        return new int[] {};
    }
}
