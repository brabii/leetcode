package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AverageOfLevelsInBinaryTreeTest {


	@Test
	public void testExemple1() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.right = new TreeNode(7);
		root.right.left = new TreeNode(15);

		List<Double> expected = new ArrayList<>();
		expected.add(3.0);
		expected.add(14.5);
		expected.add(11.0);

		assertTrue(expected.equals(AverageOfLevelsInBinaryTree.averageOfLevels(root)));
	}
}
