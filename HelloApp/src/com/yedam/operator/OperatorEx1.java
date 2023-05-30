package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		
		int result = 0;
		try {
			result = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자가 아님");
		}
		
		System.out.println("입력값은 : " + result);
		sc.close();
	}

}
