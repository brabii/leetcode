package com.leetcode.random.problems;

public class MoneyLeetCode {
	public int totalMoney(int n) {
		int y = n / 7 - 1;
		int x = n % 7;
		int ans = x * (y + 1) + (x * (x + 1)) / 2;
		if (y != -1)
			ans = ans + 28 * (y + 1) + 7 * ((y + 1) * y) / 2;
		return ans;
	}
}
