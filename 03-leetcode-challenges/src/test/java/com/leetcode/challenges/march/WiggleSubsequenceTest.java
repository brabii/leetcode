package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WiggleSubsequenceTest {
	private WiggleSubsequence ws = new WiggleSubsequence();

	@Test
	public void exemple1() throws Exception {
		int[] nums = { 1, 7, 4, 9, 2, 5 };
		int expectedVal = 6;
		assertTrue(expectedVal == ws.wiggleMaxLength(nums));
	}

	@Test
	public void validation1() throws Exception {
		int[] nums = { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 }; // 16,-12,
		int expectedVal = 7;
		assertTrue(expectedVal == ws.wiggleMaxLength(nums));
	}
}
