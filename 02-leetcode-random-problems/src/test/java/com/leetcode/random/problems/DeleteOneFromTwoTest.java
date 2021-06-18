package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class DeleteOneFromTwoTest {
	private DeleteOneFromTwo oneFromTwo = new DeleteOneFromTwo();

	@Test
	public void shouldReturnNullWhenArrayNull() throws Exception {
		assertTrue(oneFromTwo.deleteOnOfTwo(null) == null);
	}

	@Test
	public void shouldReturnArrayWhenArrayEmpty() throws Exception {
		int[] array = {};
		assertTrue(oneFromTwo.deleteOnOfTwo(array).length == 0);
	}

	@Test
	public void shouldReturnSubArrayWhenArrayNotEmpty() throws Exception {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int[] rs = { 1, 3, 5 };
		assertTrue(Arrays.equals(oneFromTwo.deleteOnOfTwo(array), rs));
		array = new int[] { 1, 2, 3 };
		rs = new int[] { 1, 3 };
		assertTrue(Arrays.equals(oneFromTwo.deleteOnOfTwo(array), rs));
	}

}
