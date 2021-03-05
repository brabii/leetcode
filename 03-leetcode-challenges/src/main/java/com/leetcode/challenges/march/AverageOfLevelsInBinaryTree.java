package com.leetcode.challenges.march;

import java.util.ArrayList;
import java.util.List;

/**
 * ceci est un exemple de solution pour avoir un moyen de niveau i de BST
 * 
 * @author rabii
 *
 */
public class AverageOfLevelsInBinaryTree {

	/**
	 * Permet de trouver le moyen de chaque niveau de BST
	 * 
	 * @param root
	 * @return list of average for every level
	 */
	public static List<Double> averageOfLevels(TreeNode root) {
		if (root == null) {
			return null;
		}
		List<Double> averages = new ArrayList<>();
		int heightBinaryTree = heightOfBinaryTree(root) + 1;
		double[] totals = new double[heightBinaryTree];
		totalOfLevel(root, 0, totals);
		for (int i = 0; i < totals.length; i++) {
			int numNodesAtLivel = countNodesAtLevelHelper(root, 0, i);
			averages.add(totals[i] / numNodesAtLivel);
		}
		return averages;
	}

	/**
	 * Permet de stocker le total de chaque niveau de BST dans l'array
	 * 
	 * @param root
	 * @param level
	 * @param totals
	 */
	static void totalOfLevel(TreeNode root, int level, double totals[]) {
		if (root == null)
			return;
		totals[level] += root.val;
		totalOfLevel(root.left, level + 1, totals);
		totalOfLevel(root.right, level + 1, totals);
	}

	/**
	 * Permet de retrouver le hauteur de BST (nombre total de niveaux de BST), on
	 * l'aura besoin pour stocker les totals de chaque niveau
	 * 
	 * @param root
	 * @return height BST
	 */
	static int heightOfBinaryTree(TreeNode root) {
		if (root.left == null && root.right == null)
			return 0;

		int left = 0;
		if (root.left != null)
			left = heightOfBinaryTree(root.left);

		int right = 0;
		if (root.right != null)
			right = heightOfBinaryTree(root.right);

		return (Math.max(left, right) + 1);
	}

	/**
	 * Permet de compter le nombre de noeuds dans un niveau de BST
	 * 
	 * @param root
	 * @param current
	 * @param desired
	 * @return number of nodes in spécific level
	 */
	public static int countNodesAtLevelHelper(TreeNode root, int current, int desired) {
		if (root == null) {
			return 0;
		}
		if (desired == current) {
			return 1;
		}
		return countNodesAtLevelHelper(root.left, current + 1, desired)
				+ countNodesAtLevelHelper(root.right, current + 1, desired);
	}
}
