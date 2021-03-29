package org.leetcode.interview.test;

import java.util.Arrays;

public class HasGroupsSizeX {
	public boolean hasGroupsSizeX(int[] deck) {
		Arrays.sort(deck);
		boolean rs = false;
		if (deck.length == 1) {
			return rs;
		} else {
			if (deck[0] != deck[1]) {
				return rs;
			}
			int first = deck[0];
			int i = 0;
			int step = 0;
			while (i < deck.length && deck[i] == first) {
				i++;
				step++;
			}
			if (step % 2 == 0) {
				if (step % 21 == 0) {
					step = 3;
				} else if (step % 17 == 0) {
					step = 5;
				} else if (step % 45 == 0) {
					step = 5;
				} else {
					step = 2;
				}
			} else if (step % 5 == 0) {
				step = 5;
			} else if (step % 9 == 0 || step % 3 == 0) {
				step = 3;
			}
			for (i = 0; i < deck.length; i = i + step) {
				int tmp = i + step;
				if (tmp <= deck.length) {
					if (deck[i] == deck[tmp - 1]) {
						rs = true;
					} else {
						rs = false;
						break;
					}
				} else {
					return false;
				}
			}
		}
		return rs;
	}
}
