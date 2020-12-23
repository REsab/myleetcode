package com.resab.day1;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
class Solution {


    public static void main(String[] args) {


        System.out.println(firstUniqChar("z"));
        String substring;
        int i;


    }

    /**
     * 用两次循环
     * 在内循环做判断
     * <p>
     * bug 最后一个判断 失败
     *
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {

        char[] chars = s.toCharArray();

        if (chars.length == 1) {
            return 0;
        }

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            for (int j = 0; j < chars.length; j++) {
                char bChar = chars[j];
                if (i == j && i != chars.length - 1) {
                    continue;
                }
                if (aChar == bChar) {
                    break;
                }
                if (j == chars.length - 1) {
                    return i;
                }
            }
        }
        return -1;

    }

    public static int firstUniqChar(String s, boolean isAnswer) {
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

//        作者：LeetCode-Solution
//        链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string/solution/zi-fu-chuan-zhong-de-di-yi-ge-wei-yi-zi-x9rok/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


}