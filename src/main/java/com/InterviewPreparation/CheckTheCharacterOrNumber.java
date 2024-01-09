package com.InterviewPreparation;

public class CheckTheCharacterOrNumber {
	public static void main(String[] args) {
		String str="kirankumar 123";
		for(int i=0;i<str.length();i++) {
			boolean flag=Character.isDigit(str.charAt(i));
			if(flag) {
				System.out.println(str.charAt(i)+""+ ":Is a number");
			}else {
				System.out.println(str.charAt(i)+" "+":Is a character");
			}
		}
	}

}
