package com.yedam.object;
import java.util.*;
public class ObjectEx2Bank {

	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];
		
		boolean run = true;
		int selectNo = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			Bank bank = new Bank();
			
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.print("선택 => ");
			selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {			//등록
				System.out.println("계좌번호 등록 >>> ");
				String acntNo = sc.nextLine();
				bank.accountNo = acntNo; 
				System.out.println("이름 등록 >>> ");
				String own = sc.nextLine();
				bank.owner = own; 
				System.out.println("넣을 돈 등록 >>> ");
				bank.balance = sc.nextInt();
			} else if(selectNo == 2) {	//조회(계좌번호)
				for(int i = 0; i < accounts.length; i++) {
					System.out.println(accounts[i]);
				}
			} else if(selectNo == 3) {	//입금
				
			} else if(selectNo == 4) {	//출금
				
			} else if(selectNo == 5) {	//종료.
				
			}
		} //end of while()
	}	//end of main		

}
