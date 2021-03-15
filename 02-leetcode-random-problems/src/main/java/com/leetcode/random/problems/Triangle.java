package com.leetcode.random.problems;

import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int sumMin = 0;
		for (List<Integer> list : triangle) {
			Integer min = 0;
			try {
				min = list.stream().mapToInt(v -> v).min().orElseThrow(Exception::new);
			} catch (Exception e) {
				e.printStackTrace();
			}
			sumMin += min;
		}
		return sumMin;
	}
}
