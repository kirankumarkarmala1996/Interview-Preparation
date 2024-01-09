package com.InterviewPreparation;

public class ReverseTheString {

	public static void main(String[] args) {
//		reverse the String
		String name="kiran",reverse="";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			//break concept
//			if(name.charAt(i)=='r') {
//				break;
//			}
			reverse=ch+reverse;
			
		}
		System.out.println(reverse);
	}
}
