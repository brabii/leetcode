package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void testExemple1() {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] expected = { 0, 1 };
		assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
	}

	@Test
	public void testExemple2() {

		int[] nums = { 3, 2, 4 };
		int target = 6;
		int[] expected = { 1, 2 };
		assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));
	}

	@Test
	public void testExemple3() {

		int[] nums = { 3, 3 };
		int target = 6;
		int[] expected = { 0, 1 };
		assertTrue(Arrays.equals(expected, TwoSum.twoSum(nums, target)));

	}
}
