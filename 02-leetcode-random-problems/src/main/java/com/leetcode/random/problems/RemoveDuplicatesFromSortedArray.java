package com.leetcode.random.problems;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		Set<Integer> nonDuplicateValues = new HashSet<>();
		for (int num : nums) {
			nonDuplicateValues.add(num);
		}

		return nonDuplicateValues.size();
	}
}
