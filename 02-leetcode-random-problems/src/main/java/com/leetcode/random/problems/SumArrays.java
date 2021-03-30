package com.leetcode.random.problems;

import java.util.ArrayList;
import java.util.List;

public class SumArrays {
	public int numOfSubarrays(int[] arr) {

//		faire la somme de tous l'array
//		les rajouter dans une liste
//		parcourir la liste et verifier si la valeur est impaire

//		1,3,5 => 1,1+3,1+5,3,3+5,5
		List<Integer> tmpRs = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int total = arr[i];
			if (total % 2 != 0) {
				tmpRs.add(total);
			}
			for (int j = i + 1; j < arr.length; j++) {
				total += arr[j];
				if (total % 2 != 0) {
					tmpRs.add(total);
				}
			}
		}
		return tmpRs.size();
	}
}
