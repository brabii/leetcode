package org.leetcode.interview.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumLeftLeafsTest {
	private SumLeftLeafs sll = new SumLeftLeafs();

	@Test
	public void exemple1() throws Exception {
		int expectSum = 24;
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		assertTrue(expectSum == sll.sumOfLeftLeaves(root));
	}
}
