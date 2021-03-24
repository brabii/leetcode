package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class AdvantageShuffleTest {
	AdvantageShuffle as = new AdvantageShuffle();

	@Test
	public void validation5() throws Exception {
		int[] A = { 12, 24, 8, 32 };
		int[] B = { 13, 25, 32, 11 };
		int[] expectA = { 24, 32, 8, 12 };
		assertTrue(Arrays.equals(expectA, as.advantageCount(A, B)));
	}
}
