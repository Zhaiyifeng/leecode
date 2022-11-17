package com.example.leecode.Array;

/**
 * @author siboni
 * @Classname SearchInsertPosition
 * @date 2022/11/16 9:51
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }
    /**
     * 35.搜索插入位置
     * <a href="https://leetcode.cn/problems/search-insert-position/">...</a>
     * @param nums
     * @param target
     * @return 返回下表或者被按顺序插入的下标
     */
    public static int searchInsert(int[] nums, int target) {
        //定义左右指针
        int left = 0,right= nums.length - 1;
        while(left<=right){
            if (target>nums[right]){
                return right+1;
            }
            if (target<nums[left]){
                return left;
            }
            if (target==nums[left]){
                return left;
            }
            if (target==nums[right]){
                return right;
            }
            if (nums[left]<target&&target<nums[right]){
                left++;
                right--;
            }else if (target<nums[right]){
                return right= right-1;
            } else if (target>nums[left]) {
                return left = left +1;
            }

        }

        return left;
    }
}
