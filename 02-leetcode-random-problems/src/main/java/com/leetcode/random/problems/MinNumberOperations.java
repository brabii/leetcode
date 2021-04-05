package com.leetcode.random.problems;

public class MinNumberOperations {
	public int minOperations(String s) {
		int a = 0;
		int b = 0;
		char swapper = '0';
		for (char ch : s.toCharArray()) {
			if (ch != swapper) {
				a++;
			} else {
				b++;
			}
			swapper = swapper == '0' ? '1' : '0';
		}
		return Math.min(a, b);
	}
}
