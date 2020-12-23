package com.resab.com.resab.day1;


import java.util.UUID;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
class Solution {


    public static void main(String[] args) {


        System.out.println(firstUniqChar("fj"));
        System.out.println(firstUniqChar("fj4osdfiuadfpcvuzvc"));
        System.out.println(firstUniqChar("fjpqu40zxcvjvamz"));
        System.out.println(firstUniqChar("fjcsdfarevzcxxv0zjcv"));
        System.out.println(firstUniqChar("fj9/q774sdfagwqfaZXv9865v1f vb er "));

        String substring;
        int i;


        substring = UUID.randomUUID().toString().replaceAll("-", "").substring(5);
        i = firstUniqChar(substring);
        System.out.println(substring + ": " + substring.substring(i, i + 1) + " ***index:" + i);



        substring = UUID.randomUUID().toString().replaceAll("-", "").substring(5);
        i = firstUniqChar(substring);
        System.out.println(substring + ": " + substring.substring(i, i + 1) + " ***index:" + i);



        substring = UUID.randomUUID().toString().replaceAll("-", "").substring(5);
        i = firstUniqChar(substring);
        System.out.println(substring + ": " + substring.substring(i, i + 1) + " ***index:" + i);



        substring = UUID.randomUUID().toString().replaceAll("-", "").substring(5);
        i = firstUniqChar(substring);
        System.out.println(substring + ": " + substring.substring(i, i + 1) + " ***index:" + i);



        substring = UUID.randomUUID().toString().replaceAll("-", "").substring(5);
        i = firstUniqChar(substring);
        System.out.println(substring + ": " + substring.substring(i, i + 1) + " ***index:" + i);



        substring = UUID.randomUUID().toString().replaceAll("-", "").substring(5);
        i = firstUniqChar(substring);
        System.out.println(substring + ": " + substring.substring(i, i + 1) + " ***index:" + i);


    }

    /**
     * 用两次循环
     * 在内循环做判断
     *
     * @param s
     * @return
     */
    public static int firstUniqChar(String s) {

        char[] chars = s.toCharArray();

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
}