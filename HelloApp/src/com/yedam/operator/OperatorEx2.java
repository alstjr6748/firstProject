package com.yedam.operator;

import java.util.*;

public class OperatorEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		System.out.println("첫 번째 값 입력");
		num1 = sc.nextInt();
		System.out.println("두 번째 값 입력");
		num2 = sc.nextInt();
//		firstMethod();
//		secondMethod();
		thirdMethod(num1, num2);
	}
	public static void firstMethod() {
		// Scanner 사용해서 입력값을 2개
		//5, 6 => 5의 6제곱에 값을 출력
		Scanner sc = new Scanner(System.in);
				
		int num1 = 0, num2 = 0, sum = 1;
		
		try {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			for(int i = 1; i <= num2; i++) {
				 sum *= num1;
			}
			System.out.println(sum);
		} catch(Exception e) {
			System.out.println("bye");
		}
	}
	
	public static void secondMethod() {
		//Scanner 활용
		//"I am a boy", 6 => 문장을 입력받은 숫자의 횟수만큼 반복출력
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		int num = 0;
		
		try {
			System.out.println("반복하고싶은 문자를 입력하세요");
			str = sc.nextLine();
			System.out.println("반복하고싶은 횟수를 입력하세요");
			num = sc.nextInt();
			for(int i = 1; i <= num; i++) {
				System.out.println(str);
			}
		} catch(Exception e) {
			System.out.println("잘못된 값(예외)");
		}
	}

	public static void thirdMethod(int a, int b) {
		//두 수를 더한다.
		int sum = a + b;
		try {
			System.out.println(sum);
		} catch(Exception e) {
			System.out.println("bye");
		}
	}
}
