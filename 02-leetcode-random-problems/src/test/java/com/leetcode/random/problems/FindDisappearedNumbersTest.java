package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindDisappearedNumbersTest {
	FindDisappearedNumbers fdn = new FindDisappearedNumbers();

	@Test
	public void testSampleExample() throws Exception {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> expected = Arrays.asList(5, 6);
		assertTrue(expected.equals(fdn.findDisappearedNumbers(nums)));
	}
}
