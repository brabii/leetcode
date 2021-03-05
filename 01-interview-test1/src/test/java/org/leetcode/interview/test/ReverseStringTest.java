package org.leetcode.interview.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testExemple1() {
		String s = "abcdefg";
		int k = 2;
		String expected = "bacdfeg";
		assertTrue(expected.equals(ReverseString.reverseStr(s, k)));
	}

	@Test
	public void testExemple2() {
		String s = "abcd";
		int k = 2;
		String expected = "bacd";
		assertTrue(expected.equals(ReverseString.reverseStr(s, k)));
	}

}
