package com.creational.singleton;

public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
	}

	// Lazy initialization
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "LazySingleton [hashCode()=" + hashCode() + "]";
	}

}