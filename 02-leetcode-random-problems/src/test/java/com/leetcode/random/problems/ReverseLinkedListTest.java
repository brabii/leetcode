package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class ReverseLinkedListTest {
	ReverseLinkedList rl = new ReverseLinkedList();

	@Test
	public void testInsertionDansArray() throws Exception {
		ListNode root = Util.insert(1, null);
		root = Util.insert(2, root);
		root = Util.insert(3, root);
		root = Util.insert(4, root);
		root = Util.insert(5, root);
		int[] expectedArray = { 1, 2, 3, 4, 5 };
		assertTrue(Arrays.equals(expectedArray, rl.ListNodeToIntArray(root)));
	}

	@Test
	public void testReverse() throws Exception {
		ListNode root = Util.insert(1, null);
		root = Util.insert(2, root);
		root = Util.insert(3, root);
		root = Util.insert(4, root);
		root = Util.insert(5, root);
		int left = 2, right = 4;
		int[] array = rl.ListNodeToIntArray(root);
		int[] expectedArray = { 4, 3, 2 };
		assertTrue(Arrays.equals(expectedArray, rl.reverse(array, left, right)));
	}

	@Test
	public void testReverseBetween() throws Exception {
		ListNode root = Util.insert(1, null);
		root = Util.insert(2, root);
		root = Util.insert(3, root);
		root = Util.insert(4, root);
		root = Util.insert(5, root);
		int left = 2, right = 4;
		ListNode rs = Util.insert(1, null);
		rs = Util.insert(4, rs);
		rs = Util.insert(3, rs);
		rs = Util.insert(2, rs);
		rs = Util.insert(5, rs);
		assertTrue(Util.isEquals(rl.reverseBetween(root, left, right), rs));
	}

	@Test
	public void testReverseBetweenValidation1() throws Exception {
		ListNode root = Util.insert(3, null);
		root = Util.insert(5, root);
		int left = 1, right = 2;
		ListNode rs = Util.insert(5, null);
		rs = Util.insert(3, rs);
		assertTrue(Util.isEquals(rl.reverseBetween(root, left, right), rs));
	}
}
