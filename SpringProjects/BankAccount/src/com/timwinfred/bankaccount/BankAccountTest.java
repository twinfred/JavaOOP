package com.timwinfred.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount();
		BankAccount acct2 = new BankAccount();
		System.out.println("Number of Accts: " + BankAccount.numberOfAccts);
		acct1.depositMoney(5.01, "Savings");
		System.out.println("Acct1: " + acct1.viewBalances());
		System.out.println("All Balances: " + BankAccount.allBalanceTotal);
		acct2.depositMoney(1943.51, "Checking");
		System.out.println("Acct2: " + acct2.viewBalances());
		System.out.println("All Balances: " + BankAccount.allBalanceTotal);
		acct2.withdrawMoney(100.99, "Checking");
		System.out.println("Acct2: " + acct2.viewBalances());
		System.out.println("All Balances: " + BankAccount.allBalanceTotal);
		acct2.withdrawMoney(10.00, "Savings");
		System.out.println("Acct2: " + acct2.viewBalances());
		System.out.println("All Balances: " + BankAccount.allBalanceTotal);
		System.out.println(acct1.getCheckingBal());
		System.out.println(acct1.getSavingsBal());
		
	}
}
