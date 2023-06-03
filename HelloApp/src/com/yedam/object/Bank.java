package com.yedam.object;

public class Bank {
	private String accountNo;	//unique
	private String owner;		//예금주
	private int balance;		//잔고	1000


	void setAccountNo(String acNo) {
		this.accountNo = acNo;
	}
	String getAccountNo() {
		return accountNo;
	}
	void setOwner(String own) {
		this.owner = own;
	}
	String getOwner() {
		return owner;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
	int getBalance() {
		return balance;
	}

}

