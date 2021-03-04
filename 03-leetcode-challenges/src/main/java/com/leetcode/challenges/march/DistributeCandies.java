package com.leetcode.challenges.march;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DistributeCandies {
	public static int distributeCandies(int[] candyType) {
		Set<Integer> set = Arrays.stream(candyType).boxed().collect(Collectors.toSet());
		if (candyType.length / 2 <= set.size()) {
			return candyType.length / 2;
		}
		return set.size();
	}
}
