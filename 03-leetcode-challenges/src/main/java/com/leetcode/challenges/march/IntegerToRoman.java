package com.leetcode.challenges.march;

public class IntegerToRoman {

	public String intToRoman(int num) {
		StringBuilder rs = new StringBuilder();
		if (num / RomanNumeral.C.getValue() != 0) {
			int numberOfMilles = num / 1000;
			num = num % 1000;
			for (int i = 0; i < numberOfMilles; i++) {
				rs.append(RomanNumeral.M);
			}
		}
		if (num / 100 != 0) {
			int numberOfCents = num / 100;
			num = num % 100;
			if (numberOfCents == 9) {
				rs.append(RomanNumeral.C + "" + RomanNumeral.M);
			} else if (numberOfCents >= 5) {
				rs.append(RomanNumeral.D);
				int count = numberOfCents - 5;
				for (int i = 0; i < count; i++) {
					rs.append(RomanNumeral.C);
				}
			} else {
				if (numberOfCents == 4) {
					rs.append(RomanNumeral.C + "" + RomanNumeral.D);
				} else {
					for (int i = 0; i < numberOfCents; i++) {
						rs.append(RomanNumeral.C);
					}
				}
			}
		}
		if (num / 10 != 0) {
			int numberOfTens = num / 10;
			num = num % 10;
			if (numberOfTens == 9) {
				rs.append(RomanNumeral.X + "" + RomanNumeral.C);
			} else if (numberOfTens >= 5) {
				rs.append(RomanNumeral.L);
				int count = numberOfTens - 5;
				for (int i = 0; i < count; i++) {
					rs.append(RomanNumeral.X);
				}
			} else {
				if (numberOfTens == 4) {
					rs.append(RomanNumeral.X + "" + RomanNumeral.L);
				} else {
					for (int i = 0; i < numberOfTens; i++) {
						rs.append(RomanNumeral.X);
					}
				}
			}
		}
		if (num / 5 != 0) {
			if (num == 9) {
				rs.append(RomanNumeral.I + "" + RomanNumeral.X);
				return rs.toString();
			} else {
				int numberOfFives = num / 5;
				num = num % 5;
				if (numberOfFives == 1) {
					rs.append(RomanNumeral.V);
				}
			}
		}
		if (num == 4) {
			rs.append(RomanNumeral.I + "" + RomanNumeral.V);
		} else {
			for (int i = 0; i < num; i++) {
				rs.append(RomanNumeral.I);
			}
		}
		return rs.toString();
	}
}
