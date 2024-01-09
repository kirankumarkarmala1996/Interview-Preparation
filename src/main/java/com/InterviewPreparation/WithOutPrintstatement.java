package com.InterviewPreparation;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class WithOutPrintstatement {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter outputStream = new OutputStreamWriter(System.out) ;
		outputStream.write("helloworld with out print statement");
	outputStream.flush();
	}

}
