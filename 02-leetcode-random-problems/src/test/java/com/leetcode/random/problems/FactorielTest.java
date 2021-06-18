package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactorielTest {
	private Factoriel factoriel = new Factoriel();

	@Test
	public void testFactorialOfZero() throws Exception {
		assertTrue(factoriel.fact(0) == 1);
	}

	@Test
	public void testFactorialOfOneAndTwo() throws Exception {
		assertTrue(factoriel.fact(1) == 1);
		assertTrue(factoriel.fact(2) == 2);
	}

	@Test
	public void testFactorialOfThreeAndFour() throws Exception {
		assertTrue(factoriel.fact(3) == 6);
		assertTrue(factoriel.fact(4) == 24);
	}

}
