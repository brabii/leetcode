package com.leetcode.challenges.march;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntegerToRomanTest {
	IntegerToRoman itr = new IntegerToRoman();

	@Test
	public void testValdation4() throws Exception {
		int num = 400;
		String expected = "CD";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testValdation3() throws Exception {
		int num = 70;
		String expected = "LXX";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testValdation2() throws Exception {
		int num = 60;
		String expected = "LX";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testValdation1() throws Exception {
		int num = 40;
		String expected = "XL";
		System.out.println(itr.intToRoman(num));
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testExemple1() throws Exception {
		int num = 3;
		String expected = "III";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testExemple2() throws Exception {
		int num = 4;
		String expected = "IV";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testExemple3() throws Exception {
		int num = 9;
		String expected = "IX";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testExemple4() throws Exception {
		int num = 58;
		String expected = "LVIII";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

	@Test
	public void testExemple5() throws Exception {
		int num = 1994;
		String expected = "MCMXCIV";
		assertTrue(expected.equals(itr.intToRoman(num)));
	}

}
