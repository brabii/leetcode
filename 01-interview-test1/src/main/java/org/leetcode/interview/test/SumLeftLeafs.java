package org.leetcode.interview.test;

public class SumLeftLeafs {

	boolean isLeaf(TreeNode node) {
		if (node == null)
			return false;
		if (node.left == null && node.right == null)
			return true;
		return false;
	}

	public int sumOfLeftLeaves(TreeNode node) {
		int res = 0;

		if (node != null) {
			if (isLeaf(node.left)) {
				res += node.left.val;
			} else {
				res += sumOfLeftLeaves(node.left);
			}
			res += sumOfLeftLeaves(node.right);
		}
		return res;
	}
}
