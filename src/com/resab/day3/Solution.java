package com.resab.day3;


import java.util.Stack;

/**
 * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 * <p>
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {


    public static void main(String[] args) {
        System.out.println(countDigitOne(824883294));

    }

    /**
     * failed
     * 超时
     * // 824883294
     *
     * @param n
     * @return
     */
    public static int countDigitOne(int n) {
        int i = 0;
        for (int j = 1; j <= n; j++) {
            String s = j + "";
            if (s.contains("1")) {
                char[] chars = s.toCharArray();
                for (char aChar : chars) {
                    if (aChar == '1') {
                        i++;
                    }
                }
            }
        }
        return i;
    }


}
