package com.example.leecode.qizi;

public class removeArray {
    public static void main(String[] args) {

        int i = removeElement(new int[]{3, 2, 2, 3}, 3);

        System.out.println(i);

    }

    public static int removeElement(int[] nums, int val) {
        //左指针
        int left = 0;
        //右指针
        int right = nums.length;
        //数组为空的情况
        if (nums.length == 0) {
            return 0;
        }
        /**
         * 首先题目一定是二分法可以解决的
         *
         * 二分法最关键的就是两个指针所以只要搞明白两个指针分别干什么这题就解决了
         */
        while (left < right) {
            //如果左指针等于目标值
            if (nums[left] == val) {
                //那么左指针等于右指针指向的值
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }

        }

        return left;
    }
}
