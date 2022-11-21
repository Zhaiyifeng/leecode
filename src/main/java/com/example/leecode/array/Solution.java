package com.example.leecode.array;

public class Solution {
    /**
     * 双指针与滑动窗口的区别在于
     * 双指针关心的是指针所指向的值
     * 而滑动窗口则是关心指针区域内的值
     */
    public static void main(String[] args) {
        int s = 15;
        int[] nums = new int[]{5,1,3,5,10,7,4,9,2,8};
        System.out.println(minSubArrayLen(s, nums));
    }

    /**209. 长度最小的子数组
     * 暴力法简单并且不可取
     * 这里采取滑动窗口
     * @param s 目标值
     * @param nums 数组
     * @return 大于目标值的最短距离
     */
    public static int minSubArrayLen(int s, int[] nums) {
        //判断 传入的数组不能为恐
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        //定义一个变量来存储距离
        int ans = Integer.MAX_VALUE;
        //定义窗口的区域
        int start = 0, end = 0;
        int sum = 0;
        //判断数组长度 只要窗口的右边不超过数组的上线的就继续循环
      while (end < nums.length) {
          sum += nums[end];
          while (sum>=s){
              ans = Math.min(ans,end - start +1);
              sum -= nums[start];
              start++;
          }
          end++;
      }

        return ans == Integer.MAX_VALUE ? 0  :  ans;
    }

}
