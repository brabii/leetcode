package com.leetcode.challenges.march;

import java.util.Objects;

public class MyHashMap {
	private int CAPACITY = 10;
	private MyMapBucket[] bucket;
	private int size = 0;

	public MyHashMap() {
		this.bucket = new MyMapBucket[CAPACITY];
	}

	private int getHash(Object key) {
		return (key.hashCode() & 0xfffffff) % CAPACITY;
	}

	private MyKeyValueEntry getEntry(Object key) {
		int hash = getHash(key);
		for (int i = 0; i < bucket[hash].getEntries().size(); i++) {
			MyKeyValueEntry myKeyValueEntry = bucket[hash].getEntries().get(i);
			if (myKeyValueEntry.getKey().equals(key)) {
				return myKeyValueEntry;
			}
		}
		return null;
	}

	public void put(int key, int value) {
		if (containsKey(key)) {
			MyKeyValueEntry entry = getEntry(key);
			entry.setValue(value);
		} else {
			int hash = getHash(key);
			if (bucket[hash] == null) {
				bucket[hash] = new MyMapBucket();
			}
			bucket[hash].addEntry(new MyKeyValueEntry<>(key, value));
			size++;
		}
	}

	public Object get(Object key) {
		return containsKey(key) ? (int) getEntry(key).getValue() : -1;
	}

	public boolean containsKey(Object key) {
		int hash = getHash(key);
		return !(Objects.isNull(bucket[hash]) || Objects.isNull(getEntry(key)));
	}

	public void delete(Object key) {
		if (containsKey(key)) {
			int hash = getHash(key);
			bucket[hash].removeEntry(getEntry(key));
			size--;
		}
	}

	public int size() {
		return size;
	}
}
