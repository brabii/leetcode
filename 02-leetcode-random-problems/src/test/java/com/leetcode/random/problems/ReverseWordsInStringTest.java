package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReverseWordsInStringTest {
	private ReverseWordsInString rws = new ReverseWordsInString();

	@Test
	public void exemple1() throws Exception {
		String s = "Let's take LeetCode contest";
		String result = "s'teL ekat edoCteeL tsetnoc";
		assertTrue(result.equals(rws.reverseWords(s)));
	}

}
