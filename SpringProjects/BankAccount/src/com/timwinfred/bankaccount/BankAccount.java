package com.timwinfred.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNum;
	private double checkingBal;
	private double savingsBal;
	public static int numberOfAccts;
	public static double allBalanceTotal;
	
	public BankAccount() {
		this.accountNum = generateAcctNum();
		numberOfAccts++;
	}
	
	private String generateAcctNum() {
		Random r = new Random();
		char[] tenDigits = new char[10];
		for(int i = 0; i<tenDigits.length; i++) {
			tenDigits[i] = (char) r.nextInt(11);
		}
		return new String(tenDigits);
	}
	
	public double getCheckingBal() {
		return checkingBal;
	}
	
	public double getSavingsBal() {
		return savingsBal;
	}
	
	public void depositMoney(double amt, String acct) {
		if(acct == "Checking") {
			checkingBal += amt;
			System.out.println("$" + amt + " was deposited into your Checking Account.");
		}else if(acct == "Savings") {
			savingsBal += amt;
			System.out.println("$" + amt + " was deposited into your Savings Account.");
		}else {
			System.out.println("There was an error with your deposit. Please try again.");
			return;
		}
		allBalanceTotal += amt;
		return;
	}
	
	public double withdrawMoney(double amt, String acct) {
		if(acct == "Checking") {
			if(amt > checkingBal) {
				System.out.println("Sorry - you can't withdraw more than you have.");
				return 0.00;
			}else {
				checkingBal -= amt;
				System.out.println("$" + amt + " was withdrawn from your Checking Account.");
			}
		}else if(acct == "Savings") {
			if(amt > savingsBal) {
				System.out.println("Sorry - you can't withdraw more than you have.");
				return 0.00;
			}else {
				savingsBal -= amt;
				System.out.println("$" + amt + " was withdrawn from your Savings Account.");
			}
		}else {
			System.out.println("There was an error with your withdraw. Please try again.");
			return 0.00;
		}
		allBalanceTotal -= amt;
		return amt;
	}
	
	public String viewBalances() {
		return "Checking: " + checkingBal + ", Savings: " + savingsBal;
	}
}
