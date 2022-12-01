package com.example.leecode.characterstring;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String blue = reverseWords("                 the sky is blue");
        System.out.println(blue);
    }

    /**
     * 反转字符串+空格
     * 151
     *
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        /**
         * 首先开头和结尾可能是空格要忽略掉
         *然后末尾单词到首部
         */

        /**
         * 思路：
         *	①反转字符串  "the sky is blue " => " eulb si yks eht"
         *	②遍历 " eulb si yks eht"，每次先对某个单词进行反转再移位
         *	   这里以第一个单词进行为演示：" eulb si yks eht" ==反转=> " blue si yks eht" ==移位=> "blue si yks eht"
         *
         *
         *	   我的思路
         *	   反转字符串
         *	   第一个if寻找字母
         *	   第二个因为字母具有连续性所以只要找到就定义一个temp存放开始下标
         *	   然后循环++直到找到空格
         *	   然后for反转字符串因为开始字符串就反转过了
         *
         *	   initialArr[k++] = initialArr[j]就是为了将字母前移移到没有空格的地方
         *	   59行if判断 j也就是字母开始的位置必须要小于字符串长度才能进去
         *	   61行if是为了判断是否为最后一个单词如果不是的话单词结尾就可以加一个空格
         *
         *	   这道题必须二刷
         *
         */
        //步骤1：字符串整体反转（此时其中的单词也都反转了）
        char[] initialArr = s.toCharArray();
        reverse(initialArr, 0, s.length() - 1);
        //应该是步骤二要去空格
        //k存放的是下表以及长度
        int k = 0;
        for (int i = 0; i < initialArr.length; i++) {
            //1.首先这是翻转过的字符串那么我们只需要直接找到单词
            if (initialArr[i] == ' ') {
                continue;
            }
            //因为单词具有连续性所以只要进来那么就可以判断字母开始的位置
            int temp = i;
            while (i < initialArr.length && initialArr[i] != ' ') {
                i++;
            }
            for (int j = temp; j < i; j++) {
                if (j == temp) {
                    reverse(initialArr, j, i - 1);
                }
                initialArr[k++] = initialArr[j];
                if (j == i - 1) {
                    if (k < initialArr.length) {
                        initialArr[k++] = ' ';
                    }
                }
            }

        }
        if (k == 0) {
            return "";
        } else {
            //参数三：以防出现如"asdasd df f"=>"f df asdasd"正好凑满不需要省略空格情况
            return new String(initialArr, 0, (k == initialArr.length) && (initialArr[k - 1] != ' ') ? k : k - 1);
        }
    }

    public static void reverse(char[] chars, int begin, int end) {
        for (int i = begin, j = end; i < j; i++, j--) {
            chars[i] ^= chars[j];
            chars[j] ^= chars[i];
            chars[i] ^= chars[j];
        }
    }

}