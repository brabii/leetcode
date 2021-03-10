package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinimumAbsoluteDifferenceInBSTTest {
	MinimumAbsoluteDifferenceInBST bst = new MinimumAbsoluteDifferenceInBST();

	@Test
	public void testExample() throws Exception {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(7);
		int expected = 1;
		assertTrue(expected == bst.getMinimumDifference(root));
	}
}
