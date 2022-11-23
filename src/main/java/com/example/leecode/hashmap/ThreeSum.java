package com.example.leecode.hashmap;

import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] ints = {-1, 0, 1, 2, -1, -4};
        threeSum(ints);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<int[]> set = new HashSet<>();
        set.add(nums);
        
    }
}
