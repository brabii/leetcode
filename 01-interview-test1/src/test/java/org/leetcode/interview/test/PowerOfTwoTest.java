package org.leetcode.interview.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowerOfTwoTest {
	@Test
	public void testNequals1ThenTrue() {
		int n = 1;
		boolean expected = true;
		assertTrue(PowerOfTwo.isPowerOfTwo(n) == expected);
	}

	@Test
	public void testNequals16ThenTrue() {
		int n = 16;
		boolean expected = true;
		assertTrue(PowerOfTwo.isPowerOfTwo(n) == expected);
	}

	@Test
	public void testNequals3ThenFalse() {
		int n = 3;
		boolean expected = false;
		assertTrue(PowerOfTwo.isPowerOfTwo(n) == expected);
	}

	@Test
	public void testNequals5ThenFalse() {
		int n = 5;
		boolean expected = false;
		assertTrue(PowerOfTwo.isPowerOfTwo(n) == expected);
	}

	@Test
	public void test2147483648() {
		int n = -2147483648;
		boolean expected = false;
		assertTrue(PowerOfTwo.isPowerOfTwo(n) == expected);
	}
}
