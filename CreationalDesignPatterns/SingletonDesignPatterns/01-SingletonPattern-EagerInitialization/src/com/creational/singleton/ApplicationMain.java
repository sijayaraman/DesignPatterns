package com.creational.singleton;

public class ApplicationMain {

	public static void main(String[] args) {
	
		//Test1
		EagerInitializedSingleton eg = EagerInitializedSingleton.getInstance();
		System.out.println(eg);
		
		//Test2
		EagerInitializedSingleton eg1 = EagerInitializedSingleton.getInstance();
		System.out.println(eg1);
		
		//Test3
		EagerInitializedSingleton eg3 = EagerInitializedSingleton.getInstance();
		System.out.println(eg3);
	}


}
