package com.example.leecode.array;

public class SpiralMatrix {

    public static void main(String[] args) {
        System.out.println(generateMatrix(5));
    }

    /**
     * 59. 螺旋矩阵 II
     * <a href="https://leetcode.cn/problems/spiral-matrix-ii/">...</a>
     * @param n 目标值
     * @return 矩阵
     */
    public static int[][] generateMatrix(int n) {
        int loop = 0;  // 控制循环次数
        int[][] res = new int[n][n];
        int start = 0;  // 每次循环的开始点(start, start)
        int count = 1;  // 定义填充数字
        int i , j;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
          //模拟x左到右
          for (j = start; j < n-loop; j++) {
              res[start][j] = count++;
          }
          //模拟y上到下
          for (i = start; i < n -loop; i++) {
              res[i][j] = count++;
          }
          //模拟x右到左
          for (; j >= loop; j--){
              res[i][j] = count++;
          }
          //模拟y下到上
          for (; i >= loop ; i--){
              res[i][j] = count++;
          }
            //中心点
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }

        return res;
    }
}
