package org.leetcode.interview.test;

import org.junit.Test;

public class AnagramTest {
	Anagram an = new Anagram();

	@Test
	public void exemple1() throws Exception {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		an.groupAnagrams(strs);
	}
}
