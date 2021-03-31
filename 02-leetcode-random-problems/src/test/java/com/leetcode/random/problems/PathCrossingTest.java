package com.leetcode.random.problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathCrossingTest {
	private PathCrossing pc = new PathCrossing();

	@Test
	public void exemple3() throws Exception {
		String path = "NNSWWEWSSESSWENNW";
		assertFalse(pc.isPathCrossing(path));
	}
	@Test
	public void exemple2() throws Exception {
		String path = "NES";
		assertFalse(pc.isPathCrossing(path));
	}
	@Test
	public void exemple1() throws Exception {
		String path = "NESWW";
		assertTrue(pc.isPathCrossing(path));
	}
}
