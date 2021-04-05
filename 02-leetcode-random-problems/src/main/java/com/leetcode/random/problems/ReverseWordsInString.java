package com.leetcode.random.problems;

public class ReverseWordsInString {
	public String reverseWords(String s) {
		String[] a = s.split(" ");
		String result = "";
		for (int i = 0; i < a.length; i++) {
			StringBuilder sb = new StringBuilder(a[i]);
			sb = sb.reverse();
			result = result.concat(sb.toString());
			if (i != a.length - 1) {
				result = result.concat(" ");
			}
		}
		return result;
	}
}
