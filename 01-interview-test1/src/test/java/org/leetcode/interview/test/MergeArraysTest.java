package org.leetcode.interview.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class MergeArraysTest {
	private MergeArrays ma = new MergeArrays();

	@Test
	public void exemple7() throws Exception {
		int[][] intervals = { { 1, 4 }, { 0, 0 } };
		int[][] expectedArray = { { 0, 0 }, { 1, 4 } };
		assertTrue(Arrays.deepEquals(ma.merge(intervals), expectedArray));
	}

	@Test
	public void exemple6() throws Exception {
		int[][] intervals = { { 1, 4 }, { 2, 3 } };
		int[][] expectedArray = { { 1, 4 } };
		assertTrue(Arrays.deepEquals(ma.merge(intervals), expectedArray));
	}

	@Test
	public void exemple5() throws Exception {
		int[][] intervals = { { 1, 4 }, { 1, 5 } };
		int[][] expectedArray = { { 1, 5 } };
		assertTrue(Arrays.deepEquals(ma.merge(intervals), expectedArray));
	}

	@Test
	public void exemple4() throws Exception {
		int[][] intervals = { { 1, 4 }, { 0, 1 } };
		int[][] expectedArray = { { 0, 4 } };
		assertTrue(Arrays.deepEquals(ma.merge(intervals), expectedArray));
	}

	@Test
	public void exemple3() throws Exception {
		int[][] intervals = { { 1, 4 }, { 0, 4 } };
		int[][] expectedArray = { { 0, 4 } };
		assertTrue(Arrays.deepEquals(ma.merge(intervals), expectedArray));
	}

	@Test
	public void exemple2() throws Exception {
		int[][] intervals = { { 1, 4 }, { 5, 6 } };
		int[][] expectedArray = { { 1, 4 }, { 5, 6 } };
		assertTrue(Arrays.deepEquals(ma.merge(intervals), expectedArray));
	}

	@Test
	public void exemple1() throws Exception {
		int[][] intervals = { { 1, 3 } };
		int[][] expectedArray = { { 1, 3 } };
		assertTrue(Arrays.deepEquals(ma.merge(intervals), expectedArray));
	}

}
