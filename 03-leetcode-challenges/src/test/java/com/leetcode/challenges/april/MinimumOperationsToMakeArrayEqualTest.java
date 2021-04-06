package com.leetcode.challenges.april;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinimumOperationsToMakeArrayEqualTest {
	private MinimumOperationsToMakeArrayEqual mo = new MinimumOperationsToMakeArrayEqual();

	@Test
	public void exemple2() throws Exception {
		int n = 6;
		int expected = 9;
		assertTrue(mo.minOperations(n) == expected);
	}

	@Test
	public void exemple1() throws Exception {
		int n = 3;
		int expected = 2;
		assertTrue(mo.minOperations(n) == expected);
	}
}
