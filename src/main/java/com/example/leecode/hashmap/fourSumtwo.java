package com.example.leecode.hashmap;

import java.util.HashMap;
import java.util.Map;

//给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：
//
//
// 0 <= i, j, k, l < n
// nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
//
//
//
//
// 示例 1：
//
//
//输入：nums1 = [1,2], nums2 = [-2,-1], nums3 = [-1,2], nums4 = [0,2]
//输出：2
//解释：
//两个元组如下：
//1. (0, 0, 0, 1) -> nums1[0] + nums2[0] + nums3[0] + nums4[1] = 1 + (-2) + (-1)
// + 2 = 0
//2. (1, 1, 0, 0) -> nums1[1] + nums2[1] + nums3[0] + nums4[0] = 2 + (-1) + (-1)
// + 0 = 0
//
//
// 示例 2：
//
//
//输入：nums1 = [0], nums2 = [0], nums3 = [0], nums4 = [0]
//输出：1
//
//
//
//
// 提示：
//
//
// n == nums1.length
// n == nums2.length
// n == nums3.length
// n == nums4.length
// 1 <= n <= 200
// -2²⁸ <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2²⁸
//
//
// Related Topics 数组 哈希表 👍 701 👎 0

public class fourSumtwo {

    /**
     * 454. 四数相加 II
     * <a href="https://leetcode.cn/problems/4sum-ii/">...</a>
     */
    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{-2, 1};
        int[] c = new int[]{-1, 2};
        int[] d = new int[]{0, 2};
        System.out.println(fourSumCount(a, b, c, d));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> ab = new HashMap<>();
        int temp;
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                //ab所有的结果put到map 如果不存在出现次数就0+1如果存在就是get之后+1
                ab.put(nums1[i] + nums2[j], ab.getOrDefault(nums1[i] + nums2[j], 0) + 1);
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                temp = nums3[i] + nums4[j];
                System.out.println(temp);
                //因为 0- （c+d） = a+b 换过来之后就是 a+b+c+d
                if (ab.containsKey(-temp)) {
                    count += ab.get(-temp);
                }
            }
        }
        return count;
    }
}
