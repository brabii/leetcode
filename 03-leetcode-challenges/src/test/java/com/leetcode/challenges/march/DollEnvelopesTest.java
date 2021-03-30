package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DollEnvelopesTest {
	private DollEnvelopes de = new DollEnvelopes();

	@Test
	public void exemple3() throws Exception {
		int[][] envelopes = { { 2, 100 }, { 3, 200 }, { 4, 300 }, { 5, 500 }, { 5, 400 }, { 5, 250 }, { 6, 370 },
				{ 6, 360 }, { 7, 380 } };
		int expectOut = 4;
		assertTrue(expectOut == de.maxEnvelopes(envelopes));
	}

	@Test
	public void exemple2() throws Exception {
		int[][] envelopes = { { 1, 1 }, { 1, 1 }, { 1, 1 } };
		int expectOut = 1;
		assertTrue(expectOut == de.maxEnvelopes(envelopes));
	}

	@Test
	public void exemple1() throws Exception {
		int[][] envelopes = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
		int expectOut = 3;
		assertTrue(expectOut == de.maxEnvelopes(envelopes));
	}
}
