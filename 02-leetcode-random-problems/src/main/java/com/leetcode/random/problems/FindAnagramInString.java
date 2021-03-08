package com.leetcode.random.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAnagramInString {
	public static void main(String[] args) {

		String a = "abab";
		String p = "ab";
		System.out.println(getIndexSubString(a, p));
	}

	static List<Integer> getIndexSubString(String a, String p) {
		List<Integer> indexs = new ArrayList<>();
		String subString = "";
		for (int i = 0; i < a.length(); i++) {
			if (i + p.length() < a.length()) {
				subString = a.substring(i, i + p.length());
				if (isAnagram(subString, p)) {
					indexs.add(i);
				}
			} else {
				subString = a.substring(a.length() - p.length(), a.length());
				if (isAnagram(subString, p)) {
					indexs.add(i);
				}
				break;
			}
		}
		return indexs;
	}

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		Set<Character> setA = new HashSet<>();
		Set<Character> setB = new HashSet<>();
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		for (int i = 0; i < aArray.length; i++) {
			setA.add(aArray[i]);
			setB.add(bArray[i]);
		}
		return setA.equals(setB);
	}
}
