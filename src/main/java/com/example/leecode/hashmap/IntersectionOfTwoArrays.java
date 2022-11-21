package com.example.leecode.hashmap;

import java.util.HashMap;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] ints = {1, 2}, ints2 = new int[]{2, 1};
        intersection(ints, ints2);
    }

    /**
     * 349. 两个数组的交集
     *
     * @return 共有的数字
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < Math.min(nums1.length, nums2.length); i++) {
            for (int j = 0; j < Math.max(nums1.length, nums2.length); j++) {
                if (nums1.length == nums2.length) {
                    if (nums2[i] == nums1[j]) {
                        map.put(nums1[j], nums1[i]);
                        index = map.size();
                    }

                } else if ((nums1.length > nums2.length ? nums1[j] : nums1[i]) == (nums2.length > nums1.length ? nums2[j] : nums2[i])) {
                    map.put(nums1.length >= nums2.length ? nums1[j] : nums1[i], nums1[i]);
                    index = map.size();
                }
            }
        }
        int[] ints = new int[index];
        Object[] toArray = map.keySet().toArray();
        for (int i = 0; i < toArray.length; i++) {
            ints[i] = (int) toArray[i];
        }

        return ints;


    }
}
