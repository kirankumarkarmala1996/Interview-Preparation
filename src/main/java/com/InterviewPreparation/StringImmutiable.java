package com.InterviewPreparation;

public class StringImmutiable {
	public static void main(String[] args) {
		String str = "AVI";

		String str1 = "avi";

		String s = new String("AVI");
//		'==' is used to reference comparison
		System.out.println(str == s);

//		when we use intern method it will point to scp object pool memory if object is same
		String s1 = new String("avi").intern();
		System.out.println(str1 == s1);
//		'.equals'  is used to content comparison
		if(str.equals(str1)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
//		see the diff between this two String
		String ss = str1.concat("kumar");
		
		System.out.println(ss);
		System.out.println(str1);
		

	}

}
