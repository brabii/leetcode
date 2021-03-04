package org.leetcode.interview.test;

/**
 * ceci un exemple de solution de l'exercice sans lopps/recursives
 * @author rabii 
 */
public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		String binary = Integer.toBinaryString(n);
		int index = binary.indexOf('1');
		if (index < 0 || n < 0) {
			return false;
		}
		StringBuilder sb = new StringBuilder(binary);
		sb.deleteCharAt(index);
		if (sb.toString().contains("1")) {
			return false;
		}
		return true;
	}
}
