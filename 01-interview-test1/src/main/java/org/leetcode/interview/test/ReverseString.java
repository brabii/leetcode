package org.leetcode.interview.test;

/**
 * 
 * @author rabii
 *
 */
public class ReverseString {
	public static String reverseStr(String s, int k) {
		if (k >= s.length()) {
			StringBuilder sb = new StringBuilder(s);
			return sb.reverse().toString();
		} else {
			StringBuilder rs = new StringBuilder();
			boolean renversion = false;
			int count = 0;
			for (int i = 0; i < s.length(); i = i + k) {
				if (count % 2 == 0) {
					renversion = true;
				} else {
					renversion = false;
				}
				count++;
				String subString = "";
				if (k + i < s.length()) {
					subString = s.substring(i, k + i);
				} else {
					subString = s.substring(i, s.length());
				}
				if (renversion) {
					StringBuilder sb = new StringBuilder(subString);
					subString = sb.reverse().toString();
				}
				rs = rs.append(subString);
			}
			return rs.toString();
		}
	}
}