package org.leetcode.interview.test;

import java.util.HashMap;
import java.util.Map;

public class OneBitCharacter {
	public boolean isOneBitCharacter(int[] bits) {
		if (bits.length == 1) {
			if (bits[0] == 1) {
				return false;
			}
			return true;
		}
		Map<Integer, Integer> map = doubleBits(bits);
		Object last = map.values().toArray()[map.size() - 1];
		if (last.equals(0)) {
			return true;
		}
		return false;
	}

	public Map<Integer, Integer> doubleBits(int[] bits) {
		Map<Integer, Integer> map = new HashMap<>();
		int i = 0;
		while (i < bits.length) {
			if (bits[i] == 0) {
				if (i + 1 < bits.length) {
					if (bits[i + 1] == 1) {
						map.put(i, bits[i] + bits[i + 1]);
						i = i + 2;
					} else {
						map.put(i, bits[i]);
						i++;
					}
				} else {
					map.put(i, bits[i]);
					i++;
				}
			} else {
				map.put(i, bits[i] + bits[i + 1]);
				i = i + 2;
			}
		}
		return map;
	}
}
