package com.creational.singleton;

public class ApplicationMain {

	public static void main(String[] args) {
	
		//Test1
		LazySingleton eg = LazySingleton.getInstance();
		System.out.println(eg);
		
		//Test2
		LazySingleton eg1 = LazySingleton.getInstance();
		System.out.println(eg1);
		
		//Test3
		LazySingleton eg3 = LazySingleton.getInstance();
		System.out.println(eg3);
	}


}
