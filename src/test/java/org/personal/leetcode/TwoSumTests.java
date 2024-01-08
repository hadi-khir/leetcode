package org.personal.leetcode;

import org.junit.jupiter.api.Test;
import org.personal.leetcode.easy.TwoSum;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TwoSumTests {

    @Test
    void returnsCorrectIndices() {

        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] indices = new int[]{0,1};
        assertArrayEquals(indices, twoSum.twoSum(nums, target));

        nums = new int[]{3, 2, 4};
        target = 6;

        indices = new int[]{1, 2};
        assertArrayEquals(indices, twoSum.twoSum(nums, target));

        nums = new int[]{3, 3};

        indices = new int[]{0, 1};
        assertArrayEquals(indices, twoSum.twoSum(nums, target));
    }

    @Test
    void returnsCorrectIndicesOptimized() {

        TwoSum twoSum = new TwoSum();

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] indices = new int[]{0,1};
        assertArrayEquals(indices, twoSum.twoSumOptimized(nums, target));

        nums = new int[]{3, 2, 4};
        target = 6;

        indices = new int[]{1, 2};
        assertArrayEquals(indices, twoSum.twoSumOptimized(nums, target));

        nums = new int[]{3, 3};

        indices = new int[]{0, 1};
        assertArrayEquals(indices, twoSum.twoSumOptimized(nums, target));
    }
}
