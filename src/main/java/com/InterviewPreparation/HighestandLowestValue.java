package com.InterviewPreparation;

public class HighestandLowestValue {
	public static void main(String[] args) {
		int min = 0;
		int arr[] = { 1, 2, 3, 4 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = min+arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
