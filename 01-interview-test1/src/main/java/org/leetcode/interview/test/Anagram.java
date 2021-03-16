package org.leetcode.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> rs = new ArrayList<>();
		List<String> subList = new ArrayList<>();
		for (int j = 0; j < strs.length; j++) {
			if (strs[j] != null) {
				String first = strs[j];
				strs[j] = null;
				if (!subList.contains(first)) {
					subList = new ArrayList<>();
					subList.add(first);
					for (int i = 1 + j; i < strs.length; i++) {
						System.err.println(strs[i]);
						if (strs[i] != null) {
							if (isAnagram(first, strs[i])) {
								subList.add(strs[i]);
								strs[i] = null;
							}
						}
					}
					System.err.println(subList);
					rs.add(subList);
				}
			}
		}
		return rs;
	}

	boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		return Arrays.equals(array1, array2);
	}
}
