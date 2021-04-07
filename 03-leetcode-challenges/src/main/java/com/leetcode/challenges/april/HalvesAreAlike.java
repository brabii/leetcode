package com.leetcode.challenges.april;

public class HalvesAreAlike {
	public static void main(String[] args) {
		new HalvesAreAlike().halvesAreAlike("abcd");
	}

	public boolean halvesAreAlike(String s) {
		s = s.toLowerCase();
		String part1 = s.substring(0, s.length() / 2);
		String part2 = s.substring(s.length() / 2, s.length());
		int countPart1 = 0, countPart2 = 0;
		for (char c : part1.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				countPart1++;
			}
		}
		for (char c : part2.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				countPart2++;
			}
		}
		return countPart1 == countPart2;
	}
}
