package com.InterviewPreparation;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int x=10;
		System.out.println("x is before swaping :"+x);
		int y=20;
		System.out.println("y is before swaping :"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X is after swaping :"+x);
		System.out.println("Y is after swaping :"+y);
	}

}
