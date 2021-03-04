package org.leetcode.interview.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author rabii
 *
 */
public class CriticalConnection {
	public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> rs = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (List<Integer> list : connections) {
			for (Integer val : list) {
				rs.add(val);
			}
		}
		Collections.sort(rs); // 00111223
		int count = 1;
		for (Integer val : rs) {
			if (map.containsKey(val)) {
				count = map.get(val);
				count++;
			} else {
				count = 1;
			}
			map.put(val, count);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				List<Integer> res = new ArrayList<>();
				res.add(entry.getKey());
				res.add(entry.getValue());
				result.add(res);
			}
		}

		return result;
	}
}
