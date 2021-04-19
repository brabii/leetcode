package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LuckyNumberInArrayTest {
	private LuckyNumberInArray lna = new LuckyNumberInArray();

	@Test
	public void exemple1() throws Exception {
		int[] arr = { 2, 2, 3, 4 };
		int expected = 2;
		assertTrue(expected == lna.findLucky(arr));
	}
}
