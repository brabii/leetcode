package com.leetcode.random.problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RotateStringTest {
	private RotateString rs = new RotateString();

	@Test
	public void exemple2() throws Exception {
		String A = "abcde";
		String B = "abced";
		assertFalse(rs.rotateString(A, B));
	}

	@Test
	public void exemple1() throws Exception {
		String A = "abcde";
		String B = "cdeab";
		assertTrue(rs.rotateString(A, B));
	}
}
