package com.creational.singleton;

public class ApplicationMain {

	public static void main(String[] args) {
	
		//Test1
		DoubleCheckedLocking eg = DoubleCheckedLocking.getInstance();
		System.out.println(eg);
		
		//Test2
		DoubleCheckedLocking eg1 = DoubleCheckedLocking.getInstance();
		System.out.println(eg1);
		
		//Test3
		DoubleCheckedLocking eg3 = DoubleCheckedLocking.getInstance();
		System.out.println(eg3);
	}


}
