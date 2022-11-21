package com.example.leecode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        twoSum(ints, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        //1.新建map结构
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{i, hashtable.get(target - nums[i])};
            }
            hashtable.put(nums[i], i);
        }
        return nums;
    }
}
