package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StringContainsAllBinaryTest {


	@Test
	public void testHasAllCodesExemple4() throws Exception {
		int k = 2;
		String s = "0110";
		assertTrue(!StringContainsAllBinary.hasAllCodes(s, k));
	}

	@Test
	public void testHasAllCodesExemple3() throws Exception {
		int k = 1;
		String s = "0110";
		assertTrue(StringContainsAllBinary.hasAllCodes(s, k));
	}

	@Test
	public void testHasAllCodesExemple2() throws Exception {
		int k = 2;
		String s = "00110";
		assertTrue(StringContainsAllBinary.hasAllCodes(s, k));
	}

	@Test
	public void testHasAllCodesExemple1() throws Exception {
		int k = 2;
		String s = "00110110";
		assertTrue(StringContainsAllBinary.hasAllCodes(s, k));
	}

	@Test
	public void testIntegerToBinary() throws Exception {
		int number = 4;
		List<String> expectedList = Arrays.asList("0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111");
		assertTrue(expectedList.equals(StringContainsAllBinary.getBinaryFromInteger(number)));
	}
}
