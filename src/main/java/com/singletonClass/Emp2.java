package com.singletonClass;


public class Emp2  {
	public static void main(String[] args) {
		ClientApp emp2 = ClientApp.getInstance();
		System.out.println(emp2);// object location
		System.out.println("hashcode of emp2 : "+emp2.hashCode());//1579572132
																  
	}

}
