package com.creational.singleton;

public class ApplicationMain {

	public static void main(String[] args) {
	
		//Test1
		StaticBlockSingleton eg = StaticBlockSingleton.getInstance();
		System.out.println(eg);
		
		//Test2
		StaticBlockSingleton eg1 = StaticBlockSingleton.getInstance();
		System.out.println(eg1);
		
		//Test3
		StaticBlockSingleton eg3 = StaticBlockSingleton.getInstance();
		System.out.println(eg3);
	}


}
