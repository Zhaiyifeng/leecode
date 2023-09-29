package com.example.leecode.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class validParentheses {
//    public static void main(String[] args) {
//        System.out.println(isValid("[]{】{}"));
//    }

    public static void main(String[] args) {
        int i, s = 0;
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (i = 3; i < a.length; i++) {
            if (a[i] % 3 == 0)
                s += a[i];
            System.out.println(a[i]);
        }
    }

    public static boolean isValid(String s) {
        Deque<Character> dequest = new LinkedList<>();

        for (Character c : s.toCharArray()) {
            // 便利字符串将左括号对应的右括号push进入队列
            if (c.equals('{')) {
                dequest.push('}');
            } else if (c.equals('[')) {
                dequest.push(']');
            } else if (c.equals('(')) {
                dequest.push(')');
                //如果队列为空说明没有括号 如果不等于c 那么就说明
            } else if (dequest.isEmpty() || dequest.peek() != c) {
                return false;
            } else {
                //移除首位
                dequest.pop();
            }
        }
        return dequest.isEmpty();
    }
}
