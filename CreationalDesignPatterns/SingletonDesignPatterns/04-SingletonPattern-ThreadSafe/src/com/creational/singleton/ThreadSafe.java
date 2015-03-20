package com.creational.singleton;

public class ThreadSafe {
	private static ThreadSafe instance;

	private ThreadSafe() {
	}

	// Lazy initialization
	public static synchronized ThreadSafe getInstance() {
		if (instance == null) {
			instance = new ThreadSafe();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "ThreadSafe [hashCode()=" + hashCode() + "]";
	}

}