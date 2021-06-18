package com.leetcode.random.problems;

public class FibonacciNumber {

	int fibonacciOf(int number) {
		if (number >= 0 && number <= 1) {
			return number;
		}
		return fibonacciOf(number - 1) + fibonacciOf(number - 2);
	}
}
