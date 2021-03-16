package org.leetcode.interview.test;

import java.util.HashMap;
import java.util.Map;

public class ReverseVoyelles {
//	Input: "leetcode"
//	Output: "leotcede"
	public static void main(String[] args) {
		System.out.println(new ReverseVoyelles().reverseVowels("leetcode"));
	}

	public String reverseVowels(String s) {
		char[] chars = s.toCharArray();
		Map<Integer, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				map.put(i, s.charAt(i));
			}
		}
		int i = 1;
		for (Map.Entry<Integer, Character> entry : map.entrySet()) {
			char tmp = chars[entry.getKey()];
			System.err.println(map.size() - i);
			chars[entry.getKey()] = chars[map.size() - i];
			chars[map.size() - i] = tmp;
			i++;
		}
		// verifier si un char est un voyelles
		// je prends le char ainsi sa position dans un map
		// je parcours le map et je fais mon traitement
		// je pense utiliser le stringbuilder ou une simple array
		return null;
	}

	public static boolean isVowel(char c) {
		return "AEIOUaeiou".indexOf(c) != -1;
	}
}
