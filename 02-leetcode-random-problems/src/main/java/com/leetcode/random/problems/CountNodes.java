package com.leetcode.random.problems;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
	public int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if (temp.left != null && temp.right != null) {
				count++;
			}
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		return count;
	}
}
