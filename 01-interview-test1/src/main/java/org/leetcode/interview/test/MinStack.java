package org.leetcode.interview.test;

public class MinStack {
	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(-2);
		stack.push(0);
		stack.push(-3);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack.getMin());
	}

	int top;
	int maxSize = 1000;
	int[] elementData = new int[maxSize];

	/** initialize your data structure here. */
	public MinStack() {
		this.top = -1;
	}

	public void push(int x) {
		if (!isFull()) {
			this.top++;
			elementData[top] = x;
		} else {
			System.out.println("stack is full");
		}
	}

	public void pop() {
		if (!isEmpty()) {
			this.top--;
		} else {
			System.out.println("stack is empty");
		}
	}

	public int top() {
		return this.elementData[this.top];
	}

	public int getMin() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < this.top + 1; i++) {
			if (min > this.elementData[i]) {
				min = this.elementData[i];
			}
		}
		return min;
	}

	public boolean isFull() {
		if (this.top == maxSize) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (this.top == -1) {
			return true;
		}
		return false;
	}
}
