package com.example.leecode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] ints = {2,-1, 15, 3, 4};
        int[] squares = sortedSquares(ints);
        for (int i = 0; i < squares.length; i++) {
            System.out.println(squares[i]);
        }
    }

    /**
     * 977. 有序数组的平方
     * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/">...</a>
     */
    public static int[] sortedSquares(int[] nums) {
        //最简单的写法 这么写死了算了
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
