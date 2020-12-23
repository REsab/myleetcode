package com.resab.day2;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个整数序列：a1, a2, ..., an，一个132模式的子序列 ai, aj,
 * ak 被定义为：当 i < j < k 时，ai < ak < aj。设计一个算法，
 * 当给定有 n 个数字的序列时，验证这个序列中是否含有132模式的子序列。
 * https://leetcode-cn.com/problems/132-pattern/
 */

public class Solution {


    public static void main(String[] args) {

        int array[] = {-1, 3, 2, 0};
        System.out.println(find132pattern(array) + "");

        int array1[] = {-1, 2, 3};
        System.out.println(find132pattern(array1) + "");


    }

    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3)
            return false;
        Stack<Integer> stack = new Stack<>();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(min[i - 1], nums[i]);
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] > min[j]) {
                while (!stack.isEmpty() && stack.peek() <= min[j])
                    stack.pop();
                if (!stack.isEmpty() && stack.peek() < nums[j])
                    return true;
                stack.push(nums[j]);
            }
        }
        return false;
    }
}


/*
Math.min()  返回两者小的那个

stack 操作
peek 不改变栈的值(不删除栈顶的值)，读取值
pop会把栈顶的值删除。
push 入栈


 */
