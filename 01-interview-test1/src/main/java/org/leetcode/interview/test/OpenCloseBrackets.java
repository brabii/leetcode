package org.leetcode.interview.test;

public class OpenCloseBrackets {

	public boolean isValid(String s) {
		int sumPare = 0;
		int sumSqPra = 0;
		int sumCurPra = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				sumPare++;
				break;
			case ')':
				sumPare--;
				break;
			case '[':
				sumSqPra++;
				break;
			case ']':
				sumSqPra--;
				break;
			case '{':
				sumCurPra++;
				break;
			case '}':
				sumCurPra--;
				break;

			default:
				throw new IllegalArgumentException();
			}
		}

		return sumPare + sumCurPra + sumSqPra == 0;
	}
}
