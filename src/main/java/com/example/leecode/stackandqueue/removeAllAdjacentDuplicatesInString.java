package com.example.leecode.stackandqueue;

import java.util.ArrayDeque;

public class removeAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("stacck"));
    }

    public static String removeDuplicates(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (deque.isEmpty() || c != deque.peek()) {
                deque.push(c);
            } else {
                deque.pop();
            }
        }
        StringBuilder s1 = new StringBuilder();
        while (!deque.isEmpty()) {
            s1.insert(0, deque.pop());
        }
        return s1.toString();
    }
}
