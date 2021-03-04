package com.leetcode.challenges.february;

public class HammingWeight {
	public static int hammingWeight(long n) {
		String binary = Long.toBinaryString(n);
		n = Long.parseLong(binary);
		int count = 0;
		while (n != 0) {
			if (n % 10 == 1) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}
}
