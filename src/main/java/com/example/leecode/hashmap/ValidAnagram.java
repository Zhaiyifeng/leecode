package com.example.leecode.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    /**
     * 242.有效的字母异位词
     * <a href="https://programmercarl.com/0242.%E6%9C%89%E6%95%88%E7%9A%84%E5%AD%97%E6%AF%8D%E5%BC%82%E4%BD%8D%E8%AF%8D.html">...</a>
     * 用的最笨的方法需要二刷
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (char i : s.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

        }
        for (char i : t.toCharArray()) {
            if (!map.containsKey(i)) {
                return false;
            }
            map.put(i, map.getOrDefault(i, 0) - 1);
        }
        for (char i : s.toCharArray()) {
            if (map.get(i) != 0) {
                return false;
            }
        }
        return true;
    }
}
