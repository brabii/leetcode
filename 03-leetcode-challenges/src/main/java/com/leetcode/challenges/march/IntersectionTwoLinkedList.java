package com.leetcode.challenges.march;


public class IntersectionTwoLinkedList {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		while (headA != null) {
			ListNode pB = headB;
			while (pB != null) {
				if (headA == pB)
					return headA;
				pB = pB.next;
			}
			headA = headA.next;
		}
		return null;
	}
}
