package com.leetcode.challenges.march;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * TODO: améliorer la méthode
 * 
 * @author rabii
 *
 */
public class MissingNumber {
	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int step = step(nums);
		if (nums.length == 1) {
			if (nums[0] == 0)
				return nums[0] + 1;
			else
				return nums[0] - 1;
		}
		if (nums.length == 2 && step > 1) {
			return step - 1;
		}
		int first = nums[0];
		int tmp = first;
		for (int i = 1; i < nums.length; i++) {
			if (Math.abs(first - nums[i]) != step) {
				return Math.abs(first + step);
			}
			first = nums[i];
		}
		if (tmp > 0) {
			return tmp - step;
		}
		return first + step;
	}

	// cette méthode va trouver le step entre les vals de nums
	public static int step(int[] nums) {
		Set<Integer> set = new HashSet<>();
		if (nums.length == 1) {
			return nums[0];
		}
		int first = nums[0];
		for (int i = 1; i < nums.length; i++) {
			set.add(Math.abs(first - nums[i]));
			first = nums[i];
		}
		return set.stream().findFirst().get();
	}
}
