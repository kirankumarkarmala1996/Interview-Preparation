package com.InterviewPreparation;

public class PrintDuplicateCharacter {

	public static void main(String[] args) {
		String str = "hello";
		int count;

		char st[] = str.toCharArray();
		for (int i = 0; i < st.length; i++) {
			count = 1;
			for (int j = i + 1; j < st.length; j++) {
				if (st[i] == st[j] & st[i] != ' ') {
					count++;
				}
			}
			//A character is considered as duplicate if count is greater than 1  
			if(count >1&&st[i]!='0')
				System.out.println(st[i]);
		}
	}

}
