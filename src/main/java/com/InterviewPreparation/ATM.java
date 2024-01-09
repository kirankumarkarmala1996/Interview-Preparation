package com.InterviewPreparation;

import java.util.Scanner;

public class ATM {

	
	    private String accountNumber;
	    private double balance;

	    public ATM(String accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: $" + amount);
	        displayBalance();
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	            displayBalance();
	        } else {
	            System.out.println("Insufficient funds. Withdrawal failed.");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Current Balance: $" + balance);
	    }
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create an account with an initial balance
	        ATM account = new ATM("123456789", 1000.0);

	        while (true) {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    account.displayBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter deposit amount: $");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter withdrawal amount: $");
	                    double withdrawalAmount = scanner.nextDouble();
	                    account.withdraw(withdrawalAmount);
	                    break;
	                case 4:
	                    System.out.println("Exiting ATM. Thank you!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}
