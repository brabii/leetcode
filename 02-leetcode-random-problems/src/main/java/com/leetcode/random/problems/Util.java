package com.leetcode.random.problems;

/**
 * déclaration d'une classe qui contient des méthodes utilitaires
 * 
 * @author rabii
 *
 */
public class Util {
	/**
	 * méthode utilitaire pour avoir le size
	 * 
	 * @param root
	 * @return size de listNode
	 */
	public static int size(ListNode root) {
		int size = 0;
		if (root == null) {
			return 0;
		}
		while (root != null) {
			root = root.next;
			size++;
		}
		return size;
	}

	/**
	 * méthode utilitaire pour l'insertion dans ListNode
	 * 
	 * @param key
	 * @param root
	 * @return ListNode
	 */
	public static ListNode insert(int key, ListNode root) {
		if (root == null) {
			return new ListNode(key);
		}
		ListNode current = root;
		ListNode parent = null;
		while (current != null) {
			parent = current;
			current = current.next;
		}
		parent.next = new ListNode(key);
		return root;
	}

	/**
	 * une méthode utilitaire pour le test d'égalité entre deux linkedkist
	 * 
	 * @param root1
	 * @param root2
	 * @return true si root1 equals root2
	 */
	public static boolean isEquals(ListNode root1, ListNode root2) {
		if (root1 == null && root2 != null) {
			return false;
		}
		if (root2 == null && root1 != null) {
			return false;
		}
		if (size(root1) != size(root2)) {
			return false;
		}
		ListNode tmp1 = root1;
		ListNode tmp2 = root2;
		while (tmp1 != null) {
			if (tmp1.val != tmp2.val) {
				return false;
			}
			tmp1 = tmp1.next;
			tmp2 = tmp2.next;
		}

		return true;
	}
}
