package com.creational.singleton;

public class ApplicationMain {

	public static void main(String[] args) {
	
		//Test1
		ThreadSafe eg = ThreadSafe.getInstance();
		System.out.println(eg);
		
		//Test2
		ThreadSafe eg1 = ThreadSafe.getInstance();
		System.out.println(eg1);
		
		//Test3
		ThreadSafe eg3 = ThreadSafe.getInstance();
		System.out.println(eg3);
	}


}
