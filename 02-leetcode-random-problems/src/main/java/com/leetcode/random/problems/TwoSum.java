package com.leetcode.random.problems;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		if (nums.length == 2) {
			if (nums[0] + nums[1] == target) {
				return new int[] { 0, 1 };
			}
		}
		int[] result = new int[2];
		int tmp = target;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			int rs = tmp - nums[i];
			if (list.contains(rs)) {
				int index = list.indexOf(rs);
				if (i != index) {
					result[0] = i;
					result[1] = index;
					return result;
				}
			}
		}
		return null;
	}
}
