package com.InterviewPreparation;

import java.util.regex.Pattern;

public class reversetheword {
	
	public static void main(String[] args) {
		String str="today is monday and date 7 march";
		
		//output=march 7 date and monday is today
		
		
		// Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
 
		 String[] temp = pattern.split(str);
	        String result = "";
	 
	        // Iterate over the temp array and store
	        // the string in reverse order.
	        for (int i = 0; i < temp.length; i++) {
	            if (i == temp.length - 1)
	                result = temp[i] + result;
	            else
	                result = " " + temp[i] + result;
	        }
	       System.out.println(result);
	    }
	

}
