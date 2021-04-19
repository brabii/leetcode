package org.leetcode.interview.test;

public class SumMatrixDiagonal {
	public int diagonalSum(int[][] mat) {
		int sum = 0;
		if (mat == null || mat.length == 0) {
			return sum;
		}
		int i = 0;
		while (i < mat.length) {
			sum += mat[i][mat.length - 1 - i];
			sum += mat[i][i];
			i++;
		}
		if (mat.length % 2 != 0) {
			sum -= mat[mat.length / 2][mat.length / 2];
		}
		return sum;
	}
}
