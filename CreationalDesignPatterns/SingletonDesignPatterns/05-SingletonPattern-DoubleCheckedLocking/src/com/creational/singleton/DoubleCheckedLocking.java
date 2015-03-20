package com.creational.singleton;

public class DoubleCheckedLocking {
	private static DoubleCheckedLocking instance;

	private DoubleCheckedLocking() {
	}

	public static synchronized DoubleCheckedLocking getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLocking.class) {
				if (instance == null) {
					instance = new DoubleCheckedLocking();
				}
			}
		}
		return instance;
	}

	@Override
	public String toString() {
		return "DoubleCheckedLocking [hashCode()=" + hashCode() + "]";
	}

}