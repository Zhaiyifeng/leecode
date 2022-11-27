package com.example.leecode.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forSum {
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            if (target <= 0 && nums[i] > 0 && nums[i] > target) break;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {

                    long tmp = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp < target) {
                        left++;
                    } else if (tmp > target) {
                        right--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[right], nums[left]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }

                }

            }


        }

        return result;


    }
}
