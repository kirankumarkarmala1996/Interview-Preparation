package com.singletonClass;

public class Emp1 {
	
	public static void main(String[] args) {
		ClientApp emp1 = ClientApp.getInstance();
		System.out.println(emp1);//com.singletonClass.ClientApp@5e265ba4
		System.out.println("hashcode of emp1"+" : "+emp1.hashCode());//1579572132
		
		System.out.println("hello");
		
	}

}
