package com.leetcode.random.problems;

public class ReverseLinkedList {

	public int[] ListNodeToIntArray(ListNode root) {
		int[] array = new int[Util.size(root)];
		ListNode current = root;
		int i = 0;
		while (current != null) {
			array[i] = current.val;
			current = current.next;
			i++;
		}
		return array;
	}

	public ListNode reverseBetween(ListNode head, int left, int right) {
		int[] array = ListNodeToIntArray(head);
		int[] reverse = reverse(array, left, right);
		int i = 0, j = 0;
		while (i < array.length) {
			int index = i + 1;
			if (index == left) {
				while (i < right) {
					array[i] = reverse[j];
					j++;
					i++;
				}
			}
			i++;
		}
		ListNode rs = null;
		for (int k = 0; k < array.length; k++) {
			rs = Util.insert(array[k], rs);
		}
		return rs;
	}

	public int[] reverse(int[] array, int left, int right) {
		int begin = 0, end = 0;
		boolean leftFounded = false, rightFounded = false;
		for (int i = 0; i < array.length; i++) {
			int index = i + 1;
			if (left == index && !leftFounded) {
				leftFounded = true;
				begin = i;
			}
			// TODO on enléve le rightFounded car on aura pas besoin, je vais tester si
			// left> right dans méthode principale
			if (right == index && !rightFounded) {
				rightFounded = true;
				end = i;
				break;
			}
		}
		int[] reverse = new int[(end - begin) + 1];
		int j = reverse.length - 1;

		for (int i = begin; i <= end; i++) {
			reverse[j] = array[i];
			j--;
		}
		return reverse;
	}
}