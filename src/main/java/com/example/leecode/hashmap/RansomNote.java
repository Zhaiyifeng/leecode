package com.example.leecode.hashmap;

public class RansomNote {

    public static void main(String[] args) {
        canConstruct("a", "b");
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] a = new int[26];
        for (char c : magazine.toCharArray()) {
            a[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            a[c - 'a']--;
            if (a[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
