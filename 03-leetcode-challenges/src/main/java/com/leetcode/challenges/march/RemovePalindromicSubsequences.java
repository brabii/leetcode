package com.leetcode.challenges.march;

public class RemovePalindromicSubsequences {
	public static void main(String[] args) {
		String s = "abbaaaab";

		System.out.println(removePalindromeSub(s));
	}

	public static int removePalindromeSub(String s) {
		if (s == null || "".equals(s)) {
			return 0;
		}
		if (isPalindrome(s)) {
			return 1;
		}
		int count = 0;
		while (!"".equals(s)) {
			s = deleteLongestPalindromeSubseq(s);
			count++;
		}
		return count;
	}

	static boolean isPalindrome(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}

	public static String deleteLongestPalindromeSubseq(String s) {
		if (isPalindrome(s)) {
			return "";
		}
		StringBuilder sb = new StringBuilder(s);
		String rev = sb.reverse().toString();
		int l1 = s.length();
		int l2 = rev.length();
		String rs = "";
		int dp[][] = new int[l1 + 1][l2 + 1];
		int begin = Integer.MAX_VALUE;
		int i = 1, j = 1;
		for (i = 1; i <= l1; i++)
			for (j = 1; j <= l2; j++) {
				if (s.charAt(i - 1) == rev.charAt(j - 1)) {
					if (i - 1 < begin) {
						begin = i - 1;
					}
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		int end = dp[i - 1][j - 1];
		s.substring(begin, end + 1);
		if (begin != 0) {
			rs = s.substring(0, begin) + s.substring(end + 1, s.length());
			System.err.println(rs);
		} else {
			rs = s.substring(end, s.length());
			System.err.println(rs);
		}
		return rs;
	}
}
