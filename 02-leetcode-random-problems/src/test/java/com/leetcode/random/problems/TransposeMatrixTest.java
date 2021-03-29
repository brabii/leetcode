package com.leetcode.random.problems;

import org.junit.Test;

public class TransposeMatrixTest {
	private TransposeMatrix tm = new TransposeMatrix();

	@Test
	public void exemple2() throws Exception {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
		tm.transpose(matrix);
	}

	@Test
	public void exemple1() throws Exception {
		int[][] matrix = { { 2, 4, 1 }, { -10, 5, 11 }, { 18, -7, 6 } };
		tm.transpose(matrix);
	}
}
