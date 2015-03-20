package com.creational.singleton;

public class ApplicationMain {

	public static void main(String[] args) {
	
		//Test1
		BillPughSingleton.BillPughSingletonHelper eg1 = new BillPughSingleton.BillPughSingletonHelper();
		System.out.println(eg1);
		
		//Test2
		BillPughSingleton.BillPughSingletonHelper eg2 = new BillPughSingleton.BillPughSingletonHelper();
		System.out.println(eg2);
		
		//Test3
		BillPughSingleton.BillPughSingletonHelper eg3 = new BillPughSingleton.BillPughSingletonHelper();
		System.out.println(eg3);
	}


}
