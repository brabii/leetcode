package com.leetcode.random.problems;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {

	public int getMinimumDifference(TreeNode root) {
		List<Integer> values = extractValues(root);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < values.size(); i++) {
			for (int j = i + 1; j < values.size(); j++) {
				if (Math.abs(values.get(j) - values.get(i)) < min) {
					if (min == 0) {
						return min;
					}
					min = Math.abs(values.get(j) - values.get(i));
				}
			}
		}
		return min;
	}

	public List<Integer> extractValues(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root.left != null) {
			result.addAll(extractValues(root.left));
		}
		if (root.right != null) {
			result.addAll(extractValues(root.right));
		}
		result.add(root.val);
		return result;
	}
}
