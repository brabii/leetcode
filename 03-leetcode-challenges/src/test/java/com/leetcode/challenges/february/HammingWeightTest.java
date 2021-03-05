package com.leetcode.challenges.february;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HammingWeightTest {

	@Test
	public void testExemple1() {
		int in = 00000000000000000000000000001011;
		int expected = 3;
		assertTrue(HammingWeight.hammingWeight(in) == expected);
	}

	@Test
	public void testExemple2() {
		int in = 00000000000000000000000010000000;
		int expected = 1;
		assertTrue(HammingWeight.hammingWeight(in) == expected);
	}

}
