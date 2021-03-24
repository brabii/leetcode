package org.leetcode.interview.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonChars {
	public static void main(String[] args) {
		String[] A = { "bella", "label", "roller" };
		System.out.println(commonChars(A));
	}

	public static List<String> commonChars(String[] A) {
		List<Set<Character>> listNonDuplicateChars = new ArrayList<>();
		List<String> rs = new ArrayList<>();
		for (String str : A) {
			char[] chars = str.toCharArray();
			Set<Character> set = new HashSet<>();
			for (char c : chars) {
				set.add(c);
			}
			listNonDuplicateChars.add(set);
		}
		for (Set<Character> set : listNonDuplicateChars) {
			System.out.println(set);
		}
		return null;
	}
}
