package com.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	static class BillPughSingletonHelper {

		private static final BillPughSingleton instance = new BillPughSingleton();

		public static BillPughSingleton getInstance() {
			return BillPughSingletonHelper.instance;
		}

	}

	@Override
	public String toString() {
		return "BillPughSingleton [hashCode()=" + hashCode() + "]";
	}

}