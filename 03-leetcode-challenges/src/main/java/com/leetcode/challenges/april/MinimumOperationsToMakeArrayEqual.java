package com.leetcode.challenges.april;
/**
 * méthode pour trouver dans combien d'itération on aura une array avec tous les valeurs égaux
 * le rempliassage de l'array se fait comme arr[i] = 2 * i + 1
 * exemple arr={1,3,5} on aura besoin de 2 itérations , c-a-d itération 1 => arr ={2,3,4}, itération 2 => arr ={3,3,3} 
 * @author rabii
 * 
 */
public class MinimumOperationsToMakeArrayEqual {

	/**
	 * un autre méthode plus simple
	 *  public int minOperations(int n) { 
	 *  	return n * n /4; 
	 *  }
	 */
	public int minOperations(int n) {
		if (n == 0) {
			return 0;
		}
		int[] arr = remplirArray(n);
		if (n == 1) {
			return arr[0];
		}

		int count = 0;
		int minIndex = 0, maxIndex = n - 1, midIndex = (minIndex + n) / 2;
		boolean enteredInLoop = false;
		while (true) {
			if (minIndex == midIndex && maxIndex == midIndex) {
				break;
			}
			while (arr[maxIndex] == arr[midIndex] && maxIndex > minIndex) {
				maxIndex--;
			}
			while (arr[minIndex] == arr[midIndex] && minIndex < maxIndex) {
				minIndex++;
			}
			if (arr[midIndex] > arr[minIndex]) {
				arr[minIndex]++;
				enteredInLoop = true;
			}
			if (arr[midIndex] < arr[maxIndex]) {
				arr[maxIndex]--;
				enteredInLoop = true;
			} else if (arr[midIndex] > arr[maxIndex]) {
				arr[maxIndex]++;
				enteredInLoop = true;
			}
			if (enteredInLoop) {
				count++;
				enteredInLoop = false;
			} else {
				return count;
			}
		}
		return count;
	}

	int[] remplirArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (2 * i) + 1;
		}
		return arr;
	}
}
