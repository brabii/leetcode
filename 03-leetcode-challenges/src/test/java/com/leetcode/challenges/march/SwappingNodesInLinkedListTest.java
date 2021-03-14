package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SwappingNodesInLinkedListTest {
	SwappingNodesInLinkedList swap = new SwappingNodesInLinkedList();

	@Test
	public void testExemple1() throws Exception {
		int[] array = { 1, 2 };
		ListNode header = null;
		for (int i = 0; i < array.length; i++) {
			header = swap.addLast(header, array[i]);
		}
		int k = 1;
		int[] expected = { 1, 4, 3, 2, 5 };

		assertTrue(swap.swapNodes(header, k) != null);
	}
}
