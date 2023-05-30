package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
//		try {
//			System.out.println("1번숫자 입력");
//			num1 = sc.nextInt();	
//			System.out.println("2번숫자 입력");
//			num2 = sc.nextInt();
//			for(int i = num1; i <= num2; i++) {
//				sum += i;
//			}
//			
//		}
//		catch(Exception e) {
//			System.out.println("예외");
//		}
//		System.out.println(sum);
		try {
		System.out.println("1번숫자 입력");
		num1 = sc.nextInt();	
		System.out.println("2번숫자 입력");
		num2 = sc.nextInt();
		if(num1 > num2) {
			for(int i = num1; i <= num2; i++) {
				if(i % 2 == 0) {				
					sum += i;
				}
			}
		} else {
			System.out.println("2번숫자가 더 크면 실행이 안됩니다.");
		}
	}
	catch(Exception e) {
		System.out.println("예외");
	}
	System.out.println(sum);
		
	}

}
