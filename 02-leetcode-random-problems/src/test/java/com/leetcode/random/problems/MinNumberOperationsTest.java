package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinNumberOperationsTest {
	private MinNumberOperations mno = new MinNumberOperations();

	@Test
	public void exemple3() throws Exception {
		String s = "1111";
		int expectedCount = 2;
		assertTrue(mno.minOperations(s) == expectedCount);
	}

	@Test
	public void exemple2() throws Exception {
		String s = "10";
		int expectedCount = 0;
		assertTrue(mno.minOperations(s) == expectedCount);
	}

	@Test
	public void exemple1() throws Exception {
		String s = "0100";
		int expectedCount = 1;
		assertTrue(mno.minOperations(s) == expectedCount);
	}
}
