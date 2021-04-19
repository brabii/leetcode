package org.leetcode.interview.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumMatrixDiagonalTest {

	private final SumMatrixDiagonal smd = new SumMatrixDiagonal();

	@Test
	public void exemple3() throws Exception {
		int[][] mat = { { 5 } };
		int expectSum = 5;
		assertTrue(expectSum == smd.diagonalSum(mat));
	}

	@Test
	public void exemple2() throws Exception {
		int[][] mat = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		int expectSum = 8;
		assertTrue(expectSum == smd.diagonalSum(mat));
	}

	@Test
	public void exemple1() throws Exception {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int expectSum = 25;
		assertTrue(expectSum == smd.diagonalSum(mat));
	}
}
