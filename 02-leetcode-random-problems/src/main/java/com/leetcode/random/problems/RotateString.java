package com.leetcode.random.problems;

public class RotateString {
	public boolean rotateString(String A, String B) {
		return A.length() == B.length() && (A + A).contains(B);
	}
}
