package com.creational.singleton;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// Private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	// Single point of global access
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

	@Override
	public String toString() {
		return "EagerInitializedSingleton [hashCode()=" + hashCode() + "]";
	}

}
