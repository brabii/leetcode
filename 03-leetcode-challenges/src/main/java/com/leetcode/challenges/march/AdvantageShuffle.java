package com.leetcode.challenges.march;

public class AdvantageShuffle {
//	méthode qui permet de faire un swapp dans un array à travers des indexes
//	parcourir l'array si je trouve pas la condition valide je cherche si il ya un élement plus grand
//	si oui je fais le swap
//	si non je laisse comme ça et je continue mon traitement

//	méthode qui verifie s'il ya un élément plus grand de celui ci, retourne son index si non -1
	public int findIndexElemToSwapWith(int[] array, int elem, int fromIndex) {
		for (int i = fromIndex; i < array.length; i++) {
			if (elem < array[i]) {
				return i;
			}
		}
		return -1;
	}

	public void swap(int[] array, int fromIndex, int toIndex) {
		int tmp = array[fromIndex];
		array[fromIndex] = array[toIndex];
		array[toIndex] = tmp;
	}

	public int[] advantageCount(int[] A, int[] B) {
		int i = 0;
		while (i < A.length) {
			while (A[i] < B[i] && i < A.length) {
				int indexElemToSwapWith = findIndexElemToSwapWith(A, B[i], i + 1);
				if (indexElemToSwapWith >= 0) {
					swap(A, i, indexElemToSwapWith);
				} else {
					i++;
				}
			}
			i++;
		}
		return A;
	}
}
