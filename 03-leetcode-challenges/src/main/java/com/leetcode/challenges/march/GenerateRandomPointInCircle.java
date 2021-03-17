package com.leetcode.challenges.march;

public class GenerateRandomPointInCircle {
	private Circle circle;

	public Circle getCircle() {
		return circle;
	}

	public GenerateRandomPointInCircle(double radius, double x_center, double y_center) {
		this.circle = new Circle(radius, x_center, y_center);
	}

	public double[] randPoint() {
		double[] randomPoints = new double[2];
		double min = -Math.pow(circle.radius, 2);
		double max = Math.pow(circle.radius, 2);
		randomPoints[0] = Math.random() * min;
		randomPoints[1] = Math.random() * max;

		return randomPoints;
	}
}
