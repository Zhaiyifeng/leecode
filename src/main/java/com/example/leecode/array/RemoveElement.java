package com.example.leecode.array;

/**
 * 27. 移除元素
 * <a href="https://leetcode.cn/problems/remove-element/">...</a>
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] ints = {1, 1};
        System.out.println(removeElement(ints, 1));
    }

    /**
     * 移除目标值  二分法！快慢指针！
     *
     * @param nums 数组
     * @param val  目标值
     * @return 返回数组长度
     */
    public static int removeElement(int[] nums, int val) {
        //定义左边指针
        int left = 0;
        //定义右边指针
        int right = nums.length;

        while (left < right) {
            //如果左指针等于目标值 那么就让右边指针的值给左边指针 同时右边指针往下去一位 只有左边不等于目标值的时候左指针才会增加所以左指针的位置就是返回值
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }


        return left;
    }
}
