package com.leetcode.random.problems;

public class DeleteOneFromTwo {

	int[] deleteOnOfTwo(int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		int newArraySize = (array.length % 2 != 0) ? (array.length / 2) + 1 : (array.length / 2);
		int[] newArray = new int[newArraySize];

		int j = 0;
		for (int i = 0; i < array.length; i = i + 2) {
			newArray[j] = array[i];
			j++;
		}

		return newArray;
	}
}
