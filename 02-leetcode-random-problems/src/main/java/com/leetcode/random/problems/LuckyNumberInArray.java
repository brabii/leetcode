package com.leetcode.random.problems;

import java.util.Arrays;

public class LuckyNumberInArray {

	public int findLucky(int[] arr) {
		int[] luckyNumbers = new int[1];
		Arrays.sort(arr);
		int first = arr[0];
		int i = 1;
		while (i < arr.length) {
			int count = 1;
			if (first == 1) {
				luckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length + 1);
				luckyNumbers[0] = count;
			}
			int k = i;
			while (k < arr.length && arr[k] == first) {

				count++;
				first = arr[k];
				k++;
			}
			if (k != i) {
				i = k;
			} else {
				i++;
			}
			if (first == count) {
				for (int j = 0; j < luckyNumbers.length; j++) {
					if (luckyNumbers[j] == 0) {
						luckyNumbers[j] = first;
						break;
					}
				}
				luckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length + 1);
			}
		}
		Arrays.sort(luckyNumbers);
		return luckyNumbers[luckyNumbers.length - 1];
	}
}
/**
 * arr={1,2,3,3,3} 1 puisqu'il existe une seule fois et 3 puisqu'il existe 3
 * fois
 */
