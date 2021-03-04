package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MissingNumberTest {
	@Test
	public void testExemple1() throws Exception {

		int[] nums = { 3, 0, 1 };
		int expected = 2;
		System.out.println(MissingNumber.missingNumber(nums));
		assertTrue(expected == MissingNumber.missingNumber(nums));
	}

	@Test
	public void testExemple2() throws Exception {

		int[] nums = { 0, 1 };
		int expected = 2;
		System.out.println(MissingNumber.missingNumber(nums));
		assertTrue(expected == MissingNumber.missingNumber(nums));
	}

	@Test
	public void testExemple3() throws Exception {

		int[] nums = { 0, 2, 4, 6, 10 };
		int expected = 8;
		System.out.println(MissingNumber.missingNumber(nums));
		assertTrue(expected == MissingNumber.missingNumber(nums));
	}

	@Test
	public void testExemple4() throws Exception {

		int[] nums = { 0 };
		int expected = 1;
		assertTrue(expected == MissingNumber.missingNumber(nums));
	}

	@Test
	public void testExemple5() throws Exception {

		int[] nums = { 0, 2 };
		int expected = 1;
		assertTrue(expected == MissingNumber.missingNumber(nums));
	}
	
	@Test
	public void testExemple6() throws Exception {
		
		int[] nums = { 1, 2 };
		int expected = 0;
		assertTrue(expected == MissingNumber.missingNumber(nums));
	}
}
