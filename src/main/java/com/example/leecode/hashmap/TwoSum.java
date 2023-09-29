package com.example.leecode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] ints = {3, 2, 4};
        twoSum(ints, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        //1.新建map结构
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            //判断map当中是否存在key
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};

            }
            hashtable.put(nums[i], i);
        }
        return nums;
    }


}