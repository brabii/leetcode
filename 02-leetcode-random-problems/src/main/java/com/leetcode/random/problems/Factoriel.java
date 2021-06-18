package com.leetcode.random.problems;

public class Factoriel {
//	0! =1
//	1! = 1
//	2! = 2 * 1 = 2
//	3! = 3 * 2 * 1 =6
//	4! = 4 * 3 * 2 * 1 = 24

	int fact(int number) {
		if (number == 0) {
			return 1;
		}
		if (number > 0 && number <= 2) {
			return number;
		}
		return number * fact(number - 1);
	}
}
