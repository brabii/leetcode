package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MajorityElementTest {
	private MajorityElement me = new MajorityElement();

	@Test
	public void exemple3() throws Exception {
		int[] nums = { 1, 2 };
		List<Integer> expectedList = Arrays.asList(1, 2);
		assertTrue(expectedList.equals(me.majorityElement(nums)));
	}

	@Test
	public void exemple2() throws Exception {
		int[] nums = { 1 };
		List<Integer> expectedList = Arrays.asList(1);
		assertTrue(expectedList.equals(me.majorityElement(nums)));
	}

	@Test
	public void exemple1() throws Exception {
		int[] nums = { 3, 2, 3 };
		List<Integer> expectedList = Arrays.asList(3);
		assertTrue(expectedList.equals(me.majorityElement(nums)));
	}
}
