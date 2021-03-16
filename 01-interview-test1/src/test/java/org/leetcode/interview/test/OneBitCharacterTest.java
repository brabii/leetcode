package org.leetcode.interview.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OneBitCharacterTest {
	OneBitCharacter obc = new OneBitCharacter();

	@Test
	public void testValidation2() throws Exception {
		int[] bits = { 1, 1, 0 }; // 0 ,10
		boolean expected = true;
		assertTrue(expected == obc.isOneBitCharacter(bits));
	}

	@Test
	public void testValidation1() throws Exception {
		int[] bits = { 0, 1, 0 }; // 0 ,10
		boolean expected = true;
		assertTrue(expected == obc.isOneBitCharacter(bits));
	}

	@Test
	public void exemple1() throws Exception {
		int[] bits = { 1, 0, 0 };
		boolean expected = true;
		assertTrue(expected == obc.isOneBitCharacter(bits));
	}

	@Test
	public void exemple2() throws Exception {
		int[] bits = { 1, 1, 1, 0 };
		boolean expected = false;
		assertTrue(expected == obc.isOneBitCharacter(bits));
	}

	@Test
	public void test1() throws Exception {
		int[] bits = { 1 };
		boolean expected = false;
		assertTrue(expected == obc.isOneBitCharacter(bits));
	}

	@Test
	public void test2() throws Exception {
		int[] bits = { 0 };
		boolean expected = true;
		assertTrue(expected == obc.isOneBitCharacter(bits));
	}
}
