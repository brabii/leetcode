package com.leetcode.random.problems;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReachingPointsTest {
	ReachingPoints rp = new ReachingPoints();

	@Test
	public void testExample1() throws Exception {
		int sx = 1, sy = 1, tx = 3, ty = 5;
		assertTrue(rp.reachingPoints(sx, sy, tx, ty));
	}

	@Test
	public void testExample2() throws Exception {
		int sx = 3, sy = 3, tx = 12, ty = 9;
		assertTrue(rp.reachingPoints(sx, sy, tx, ty));
	}
}
