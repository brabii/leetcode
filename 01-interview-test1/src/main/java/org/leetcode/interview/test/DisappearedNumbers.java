package org.leetcode.interview.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * ceci est un exemple d'une solution pour trouver un sublist n'est pas présente
 * dans l'array nums
 * 
 * @author rabii
 *
 */
public class DisappearedNumbers {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> rs = new ArrayList<>();

		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

		List<Integer> list = new ArrayList<>(set);

		int first = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			int diff = list.get(i) - first; // 4
			if (diff > 1) {
				int j = i + 1;
				while (j < list.get(i)) {
					rs.add(j);
					j++;
				}
				first = j;
			}
		}
		return rs;
	}
}
