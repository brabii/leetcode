package com.leetcode.random.problems;

public class PathCrossing {
	public boolean isPathCrossing(String path) {
		Point p = new Point();
		for (int i = 0; i < path.length(); i++) {
			switch (String.valueOf(path.charAt(i))) {
			case "N":
				p.y = p.y + 1;
				break;
			case "E":
				p.x = p.x + 1;
				break;
			case "S":
				p.y = p.y - 1;
				break;
			case "W":
				p.x = p.x - 1;
				break;
			}
			System.err.println("p.x => " + p.x);
			System.err.println("p.y => " + p.y);
			if (!"".equals(path) && (p.x == 0 && p.y == 0)) {
				return true;
			}
		}
		return false;
	}

	class Point {
		int x;
		int y;
	}
}
