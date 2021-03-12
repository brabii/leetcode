package com.leetcode.challenges.march;

import java.util.ArrayList;
import java.util.List;

public class StringContainsAllBinary {
	public static void main(String[] args) {
		int k = 4;
		int need = 1 << k;
		System.out.println(need);
	}

	public static boolean hasAllCodes(String s, int k) {
		if (s == null || "".equals(s) || s.length() <= k) {
			return false;
		}
		List<String> binaries = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (i + k <= s.length()) {
				String binary = s.substring(i, i + k);
				if (!binaries.contains(binary)) {
					binaries.add(binary);
					if (binaries.containsAll(getBinaryFromInteger(k))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static List<String> getBinaryFromInteger(int number) {
		List<String> binaries = new ArrayList<>();
		if (number == 0) {
			binaries.add("0");
		} else {
			int maxNumber = (int) Math.pow(2, number);
			for (int i = 0; i < maxNumber; i++) {
				String binary = String.format("%" + number + "s", Integer.toBinaryString(i)).replace(' ', '0');
				System.err.println(binary);
				binaries.add(binary);
			}
		}
		return binaries;
	}
}
