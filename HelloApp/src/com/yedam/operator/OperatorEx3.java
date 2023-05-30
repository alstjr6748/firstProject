package com.yedam.operator;
import java.util.*;
public class OperatorEx3 {

	public static void main(String[] args) {
		//변수 balance 선언
		//입력값을 판단 => 1이라는 값이 들어오면 balance에 값을 추가 
		//				2가 들어오면 balance에 값을 뺀다.
		//				3이 들어오면 balance 값을 콘솔 출력
		//				4가 들어오면 프로그램 종료
//		method1();
//		method2();
		method3();
	}	
	public static void method1() {
		// 반복처리. while
		int num1 = 1;
		
//				while(num1 <= 10) {
//					System.out.println(num1++);
//				}
		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while(isOK) {
			System.out.println(num1++);
			if(num1 >= 10) {
				isOK = false;
			}
		}
		Scanner sc = new Scanner(System.in);
		//quit 구문을 입력하면 반복종료
		
		while(true) {
			System.out.println("문장을 입력하세요");
			String str = sc.nextLine();
			System.out.println("입력값은 : " + str + "입니다.");
			if(str.equals("quit")) {
				break;
			}
		}
		System.out.println("end of prog");
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("1)추가 2)차감 3)balance 출력 4)종료");
			int menu = sc.nextInt();
			if(menu == 1) {
				balance ++;
			} else if(menu == 2) {
				balance --;
			} else if(menu == 3) {
				System.out.println("현재 balance 의 값은 : " + balance + " 입니다.");
			} else if(menu == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("1~4 만 입력가능합니다");
			}
		}
	}
	
	public static void method3() {
		//balance 가 0 ~ 100,000 범위 내에서만하고 추가 또는 차감.
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		
		while(true) {
			System.out.println("1)추가 2)차감 3)balance 출력 4)종료");
			int menu = sc.nextInt();
			if(menu == 4) {
				System.out.println("종료합니다.");
				break;
			}
			if(menu == 1) {
				int sum = sc.nextInt();
				if(balance + sum > 100000) {
					System.out.println("100000을 초과");
				} else {					
					balance += sum;
				}
			}else if(menu == 2) {
				int sum = sc.nextInt();
				if(balance - sum < 0) {
					System.out.println("0이하");
				} else {					
					balance -= sum;
				}
			} 
			if(menu == 3) {
				System.out.println("현재 balance 의 값은 : " + balance + " 입니다.");
			}
		}
	}
}
