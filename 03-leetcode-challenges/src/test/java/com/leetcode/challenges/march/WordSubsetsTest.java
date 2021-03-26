package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordSubsetsTest {
	@Test
	public void test10() throws Exception {
		String A[] = { "amazon", "apple", "facebook", "google", "leetcode" };
		String B[] = { "lo", "eo" };
		List<String> expected = Arrays.asList("google", "leetcode");
		assertTrue(expected.equals(WordSubsets.wordSubsets(A, B)));
	}

	@Test
	public void exemple1() throws Exception {
		String A[] = { "amazon", "apple", "facebook", "google", "leetcode" };
		String B[] = { "e", "o" };
		List<String> expected = Arrays.asList("facebook", "google", "leetcode");
		assertTrue(expected.equals(WordSubsets.wordSubsets(A, B)));
	}
}
