package com.example.leecode.array;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] ints = {2,-1, 15, 3, 4};
        int[] squares = sortedSquares(ints);
        for (int square : squares) {
            System.out.println(square);
        }
    }

    /**
     * 977. 有序数组的平方
     * <a href="https://leetcode.cn/problems/squares-of-a-sorted-array/">...</a>
     */
    public static int[] sortedSquares(int[] nums) {
        //最简单的写法 这么写死了算了
        int left = 0;
        int right = nums.length - 1;
        int[] ints = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right){
            if (nums[left] * nums[left] > nums[right] * nums[right]){
                ints[index] = nums[left] * nums[left];
                index --;
                left++;
            }else {
                ints[index] = nums[right] * nums[right];
                index --;
                right--;
            }
        }
        return ints;
    }
    }
