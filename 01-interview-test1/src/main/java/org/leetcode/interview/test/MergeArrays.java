package org.leetcode.interview.test;

import java.util.ArrayList;
import java.util.List;

public class MergeArrays {
	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		new MergeArrays().merge(intervals);
	}

	public int[][] merge(int[][] intervals) {
		if (intervals.length == 0 || intervals.length == 1) {
			return intervals;
		}
		Interval[] inters = new Interval[intervals.length];

		/**
		 * remplissage de l'array Interval
		 */
		for (int i = 0; i < intervals.length; i++) {
			Interval interval = new Interval();
			for (int j = 0; j < intervals[i].length; j++) {
				if (interval.start == Integer.MIN_VALUE) {
					interval.start = intervals[i][j];
				}
				if (interval.start != Integer.MIN_VALUE) {
					interval.end = intervals[i][j];
				}
			}
			inters[i] = interval;
		}
		/**
		 * verifier le merge et ajouuter le résultat à une liste TODO pour améliorer je
		 * peux rajouter les éléments dans une tableau avec la méthode Arrays.copyOf
		 */
		Interval firstInterval = inters[0];
		List<Interval> list = new ArrayList<>();
		for (int i = 1; i < inters.length; i++) {
			if (firstInterval.merge(inters[i]) != null) {
				firstInterval = firstInterval.merge(inters[i]);
				list.add(firstInterval);
			} else {
				if (inters.length == 2) {
					return intervals;
				} else {
					list.add(inters[i]);
				}
			}
		}
		/**
		 * pacourir la liste aprés le merge et affecter ses éléments dans une nouvelle
		 * array
		 */
		int[][] rs = new int[list.size()][2];
		for (int i = 0; i < rs.length; i++) {
			for (int j = 0; j < rs[i].length; j++) {
				if (j == 0) {
					rs[i][j] = list.get(i).start;
				} else {
					rs[i][j] = list.get(i).end;
				}
			}
		}
		return rs;
	}

	class Interval {
		int start = Integer.MIN_VALUE;
		int end;

		public Interval() {

		}

		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		Interval merge(Interval a) {
			if (this.start >= a.start && this.end >= a.end) {
				return new Interval(a.start, this.end);
			}
			if (this.start >= a.start && this.end < this.end) {
				return new Interval(a.start, a.end);
			}
			if (this.start <= a.start && this.end >= a.end) {
				return new Interval(this.start, this.end);
			}
			if (this.start <= a.start && this.end < a.end) {
				return new Interval(this.start, a.end);
			}
			if ((this.start <= a.start || this.start >= a.start) && this.end >= a.start) {
				if (this.start <= a.start) {
					return new Interval(this.start, a.end);
				} else if (this.start >= a.start) {
					return new Interval(a.start, a.end);
				}
			}
			return null;
		}
	}
}

//	problémes:
//		si l'intervalle suivant on a pas de merge alors, je passe au celui de suivant
//		je continue cette opération jusqu'a je merge tous
//		