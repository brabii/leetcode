package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FibonacciNumberTest {
	private FibonacciNumber fNumber = new FibonacciNumber();

	@Test
	public void testfibonacciOfZero() throws Exception {
		assertTrue(fNumber.fibonacciOf(0) == 0);
	}

	@Test
	public void testfibonacciOfOneAndTwo() throws Exception {
		assertTrue(fNumber.fibonacciOf(1) == 1);
		assertTrue(fNumber.fibonacciOf(2) == 1);
	}

	@Test
	public void testfibonacciOfThree() throws Exception {
		assertTrue(fNumber.fibonacciOf(3) == 2);
	}

}
