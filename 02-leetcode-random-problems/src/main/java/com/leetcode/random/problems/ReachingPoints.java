package com.leetcode.random.problems;

/**
 * 
 * @author rabii
 *
 */
public class ReachingPoints {

	public boolean reachingPoints(int sx, int sy, int tx, int ty) {
		boolean isSYAffected = false;
		while (sx <= tx && sy <= ty) {
			System.err.println("sx = " + sx + " sy = " + sy + " tx = " + tx + " ty = " + ty);
			if (sx == tx && sy == ty) {
				return true;
			}
			if (!isSYAffected) {
				sy = sx + sy;
				isSYAffected = true;
			} else {
				sx = sx + sy;
				isSYAffected = false;
			}
		}
		return false;
	}
}
