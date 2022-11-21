package com.example.leecode.array;


public class BinarySearch {

    public static void main(String[] args) {


        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(ints, 5));
    }
    /**
     * Binary Search
     * <p>
     * 704. 二分查找    <a href="https://leetcode.cn/problems/binary-search/">...</a>
     */
    public static int search(int[] nums, int target){
       int left = 0;
       int right = nums.length-1;

       while (left <= right) {
           //定义一个中轴
           int mind = (right - left) / 2 + left;
           if(nums[mind] == target){
               return  mind;
           //如果目标值小于  说明他处于中轴左边
           }else if(nums[mind] > target) {
               right = mind -1;
           } else{
               //不是小于那么就是大于了也就是在中轴右边
               left = mind + 1;
           }
       }
        return -1;
    }
}
