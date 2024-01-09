package com.InterviewPreparation;

public class PrintTheOwelsInGivenString {
	public static void main(String[] args) {
		
	
	String str ="Hello how are you what is this";
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='A'||str.charAt(i)=='a'||str.charAt(i)=='E'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U') {
			System.out.println("vowels"+": "+str.charAt(i)+" position"+": "+i);
		}
	}

}
}
