package com.leetcode.challenges.april;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class HalvesAreAlikeTest {
	private HalvesAreAlike haa = new HalvesAreAlike();

	@Test
	public void exemple78() throws Exception {
		String s = "MerryChristmas";
		assertFalse(haa.halvesAreAlike(s));
	}
}
