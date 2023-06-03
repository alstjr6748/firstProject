package com.yedam.object;

import java.util.*;

public class ObjectEx2Bank {
	static Bank[] accounts = new Bank[3]; // 3개씩 담을 수 있게 지정.
	static Scanner sc = new Scanner(System.in);
	
	
	//계좌 존재여부
	public static boolean checkAccount(String accountNo) {
		boolean isExist = false;
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null && accounts[i].getAccountNo().equals(accountNo)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	
	public static void printAry() {
		for (Bank bank : accounts) {
			System.out.println(bank.getAccountNo());
		}
	}

	// 계좌등록
	public static void registerAccount() {
		Bank bank = new Bank();
		System.out.print("계좌번호 등록 >>> ");
		String acntNo = sc.nextLine();
		bank.setAccountNo(acntNo);

		System.out.print("이름 등록 >>> ");
		String own = sc.nextLine();
		bank.setOwner(own);

		System.out.print("넣을 돈 등록 >>> ");
		int balance = Integer.parseInt(sc.nextLine());
		bank.setBalance(balance);

		for (int i = 0; i < accounts.length; i++) { // 위에서 값을 받은(acntNo, own, balance)를 배열에 넣어주는 코드

			if (accounts[i] == null) {
				accounts[i] = bank;
				System.out.println("정상적으로 등록이 되었습니다.");
				break;
			}
		}
	}

	// 계좌 조회
	public static void searchAccount() {
		System.out.print("조회할 계좌번호 >>");
		String acntNo = sc.nextLine();
		boolean isTrue = false;
		for (int i = 0; i < accounts.length; i++) {
			// 배열위치의 값이 null이 아닌 경우에만 조건검색.
			if (accounts[i] != null && accounts[i].getAccountNo().equals(acntNo)) {
				System.out.printf("예금주 : %s, 잔액 : %s\n", accounts[i].getOwner(), accounts[i].getBalance());
				isTrue = true;
				break; // 조회하려는 계좌를 발견하면 반복을 종료
			}
		}
		if (!isTrue) {
			System.out.println("계좌가 존재하지않음");
		}
	}

	//입금
	public static void deposit() {
		System.out.print("계좌번호 입력 >>> ");
		String acntNo = sc.nextLine();
		// 입력한 계좌 존재여부 체크
		boolean isTrue = checkAccount(acntNo);
		if (!isTrue) {
			System.out.println("찾는 계좌가 없습니다.");
			deposit();
		}
		System.out.print("금액입력 >>> ");
		int balance = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < accounts.length; i++) {
			// 배열위치의 값이 null이 아닌 경우에만 조건검색.
			if (accounts[i] != null && accounts[i].getAccountNo().equals(acntNo)) {
				accounts[i].setBalance(accounts[i].getBalance() + balance);
			}
		}
	}

	//출금
	public static void withdraw() {
		System.out.print("계좌번호 입력 >>> ");
		String acntNo = sc.nextLine();
		// 입력한 계좌 존재여부 체크
		boolean isTrue = checkAccount(acntNo);
		if (!isTrue) {
			System.out.println("찾는 계좌가 없습니다.");
			withdraw();
		}
		System.out.print("금액입력 >>> ");
		int balance = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < accounts.length; i++) {
			// 배열위치의 값이 null이 아닌 경우에만 조건검색.
			if (accounts[i] != null && accounts[i].getAccountNo().equals(acntNo)) {
				accounts[i].setBalance(accounts[i].getBalance() - balance);
			}
		}
	}
	
	public static void removeAccount() {
		System.out.print("삭제하고싶은 계좌번호 입력 >>> ");
		String acntNo = sc.nextLine();
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null && accounts[i].getAccountNo().equals(acntNo)) {
				accounts[i] = null;		//값을 null 로 넣으면 삭제가 된다.
				System.out.print("정상적으로 삭제되었습니다.");
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		int selectNo = 0;
		int count = 0;

		while (run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.삭제 6.종료");
			System.out.print("선택 => ");
			selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) { // 등록
				registerAccount();
			} else if (selectNo == 2) { // 조회(계좌번호)
				searchAccount();
			} else if (selectNo == 3) { // 입금
				deposit();
			} else if (selectNo == 4) { // 출금
				withdraw();
			} else if(selectNo == 5) {
				removeAccount();
			} else if (selectNo == 6) { // 종료.
				run = false;
				System.out.print("종료합니다.");
			}
		} // end of while()
	} // end of main

}
