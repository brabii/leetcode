package com.leetcode.random.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {
	/**
	 * 
	 * @param nums
	 * @return les éléments qui sont présents plus que la taille de l'array / 3
	 */
	public List<Integer> majorityElement(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		List<Integer> rs = new ArrayList<>();
		int seuil = nums.length / 3;// 1,2,0=> seuil = 3/3=1
//		je sors l'array
//		je parcurs l'array et je verifie l'égalité de i et i+1 je déclare un compteur
//		si à certain moment le compteur dépasse la seuil je rajoute l'élement dans la list
		Arrays.sort(nums);
		int i = 0;
		while (i < nums.length) {
			int count = 0;
			int nextIndex = i + 1;
			while (nextIndex < nums.length && nums[i] == nums[nextIndex]) {
				nextIndex++;
				count++;
			}
			if (count >= seuil) {
				rs.add(nums[i]);
			}
			i = nextIndex;
		}
		return rs;
	}
}
