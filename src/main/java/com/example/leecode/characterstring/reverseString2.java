package com.example.leecode.characterstring;

public class reverseString2 {
    /*
      反转字符串2
      https://leetcode.cn/problems/reverse-string-ii/
     */
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    /**
     * 反转字符串2
     *
     * @param s 目标字符串
     * @return 反转过后
     * <p>
     * 这道题的核心点在于对于区间的处理
     * for循环的i+=2*k很好地处理了计算2k字符串的问题
     * 而Math.min(i + k, size) - 1)这一段代码又很好的处理了剩下字符串不够k的问题
     */
    public static String reverseStr(String s, int k) {
        int size = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < size; i += 2 * k) {
            getChars(chars, i, Math.min(i + k, size) - 1);
        }
        return String.valueOf(chars);
    }

    private static void getChars(char[] s, int left, int right) {
        while (left < right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
    }
}
