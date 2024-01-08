package org.personal.leetcode.easy;

import java.util.HashMap;

public class TwoSum {

    /**
     * Initial brute force solution.
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     */
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                boolean isTarget = nums[i] + nums[j] == target;
                if (isTarget) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    /**
     * Optimized one pass hash table solution.
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     */
    public int[] twoSumOptimized(int[] nums, int target) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i]) && numsMap.get(target - nums[i]) != i) {
                return new int[]{i, numsMap.get(target - nums[i])};
            }
        }

        return null;
    }
}
