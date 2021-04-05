package org.leetcode.interview.test;

import org.junit.Test;

public class RemoveDuplicatesTest {
	private RemoveDuplicates rd = new RemoveDuplicates();

	@Test
	public void validation16() throws Exception {
		int[] nums = { 1, 1, 2 };
		System.err.println(rd.removeDuplicates(nums));
	}
}
