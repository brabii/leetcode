package com.leetcode.random.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> rs = new ArrayList<>();
		if (nums == null) {
			return null;
		}
		if (nums.length == 0) {
			return rs;
		}
		Arrays.sort(nums);
		if (nums.length == 1) {
			rs.add(nums[0]);
			return rs;
		}
		int first = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int numberOfMissingNumber = Math.abs(first - nums[i]);
			System.err.println(numberOfMissingNumber);
			if (numberOfMissingNumber > 1) {
				int step = 1;
				for (int j = i; j < numberOfMissingNumber + i - 1; j++) {
					rs.add(nums[i - 1] + step);
					step++;
				}
			}
			first = nums[i];
		}
		return rs;
	}
}
