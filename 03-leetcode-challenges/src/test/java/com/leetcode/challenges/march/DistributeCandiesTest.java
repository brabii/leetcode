package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DistributeCandiesTest {
	@Test
	public void testExemple1() {
		int candyType[] = { 1, 1, 2, 2, 3, 3 };
		int expected = 3;
		assertTrue(DistributeCandies.distributeCandies(candyType) == expected);
	}

	@Test
	public void testExemple2() {
		int candyType[] = { 1, 1, 2, 3 };
		int expected = 2;
		assertTrue(DistributeCandies.distributeCandies(candyType) == expected);
	}

	@Test
	public void testExemple3() {
		int candyType[] = { 6, 6, 6, 6 };
		int expected = 1;
		assertTrue(DistributeCandies.distributeCandies(candyType) == expected);
	}
}
