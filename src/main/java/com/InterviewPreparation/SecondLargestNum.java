package com.InterviewPreparation;

import java.util.Iterator;

public class SecondLargestNum {

	public static void main(String[] args) {

		int temp, size;
		int arr[] = { 10, 25, 48, 62, 24, 55, 77 };
		size = arr.length;

		for (int i = 0; i <size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("second largest number is:: " + arr[size - 2]);

	}

}
