package com.leetcode.random.problems;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		ListNode current1 = l1;
		ListNode current2 = l2;
		while (current1 != null) {
			firstList.add(current1.val);
			current1 = current1.next;
		}
		while (current2 != null) {
			secondList.add(current2.val);
			current2 = current2.next;
		}
		getSameSizeList(firstList, secondList);
		ListNode rs = null;
		int total = 0, rest = 0;
		for (int i = 0; i < firstList.size(); i++) {
			total = firstList.get(i) + secondList.get(i) + rest;
			if (total < 10) {
				rs = insert(total, rs);
				rest = 0;
			} else {
				rs = insert(total % 10, rs);
				rest = total / 10;
			}
		}
		if (rest != 0) {
			rs = insert(rest, rs);
		}
		return rs;
	}

	static void getSameSizeList(List<Integer> list1, List<Integer> list2) {
		int size = 0;
		if (list1.size() > list2.size()) {
			size = (list1.size() - list2.size());
			for (int i = 0; i < size; i++) {
				list2.add(0);
			}
		} else if (list1.size() < list2.size()) {
			size = (list2.size() - list1.size());
			for (int i = 0; i < size; i++) {
				list1.add(0);
			}
		}
	}

	static ListNode insert(int total, ListNode root) {
		if (root == null) {
			root = new ListNode(total);
		} else {
			ListNode current = root;
			ListNode parent = null;
			while (current != null) {
				parent = current;
				current = current.next;
			}
			parent.next = new ListNode(total);
		}
		return root;
	}
}
