package com.example.leecode.hashmap;

import java.util.HashSet;
import java.util.Set;

public class isHappy {
    public static void main(String[] args) {

    }

    /**
     * 202. 快乐数
     * 非常巧妙的一个思路 因为如果==1可以直接返回
     * 如果不等于一那么他就会陷入循环
     * 慢指针会追上快指针
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        //定义一个hashset set不能重复
        Set<Integer> record = new HashSet<>();
        // 如果不等于一或者set里面没有这个数字就继续循环下去
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }
        //结果已经出来了
        return n == 1;
    }

    private int getNextNumber(int n) {
        int res = 0;
        while (n > 0) {
            //取余拿到个位数
            int temp = n % 10;
            res += temp * temp;
            //三位数两轮/10就变成个位数了
            n = n / 10;
        }
        return res;
    }
}
