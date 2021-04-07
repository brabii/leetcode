package org.leetcode.interview.test;

import java.util.Arrays;

public class SumLastDigitArray {
	public static void main(String[] args) {
		int[] digits = { 9 };
		new SumLastDigitArray().plusOne(digits);
	}

	public int[] plusOne(int[] digits) {
		int sum = digits[digits.length - 1] + 1;
		if (sum > 9) {
			digits = Arrays.copyOf(digits, digits.length + 1);// incrementer
			digits[digits.length - 2] = sum / 10; // =>1
			digits[digits.length - 1] = sum % 10; // =>0
		} else {
			digits[digits.length - 1] = sum;
		}
		return digits;
	}
}
