package com.yedam.control;

public class ControlEx3 {

	public static void main(String[] args) {
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		int month = 6;
		System.out.println(days);
		System.out.println("===========================");
		for(int i = 0; i < getFirstDate(month); i++) {			
			System.out.printf("%3s ", "");
		}
		
		for(int day = 1; day <= getLastDate(month); day++) {
			System.out.printf("%3d ", day);
			if((getFirstDate(month) + day) % 7 == 0) {
				System.out.println();
			}
		}
		
	}
	
	public static int getFirstDate(int month) {
		int result = 0;
		
		switch(month) {
			case 4:
				result = 6; break;
			case 5:
				result = 1; break;
			case 6:
				result = 4; break;
		}
		return result;
	}
	
	public static int getLastDate(int month) {
		int result = 30;
		
		switch(month) {
			case 4:
				result = 30;
			case 5:
				result = 31;
			case 6:
				result = 30;
		}
		return result;
	}
	
	public static void method1() {
		// 반복문 : for, while, do ~ while
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				System.out.println("i 값은 " + i);
			} else {
				System.out.println("짝수 입니다");
			}
		}
	}

	public static void method2() {
		for (int num2 = 2; num2 <= 5; num2++) {
			int num1 = num2;
			for (int num = 1; num <= 9; num++) {
				System.out.printf("%d * %d = %d \n", num1, num, (num1 * num));
			}
		}
		for (int num = 1; num <= 9; num++) {
			for (int num2 = 2; num2 <= 5; num2++) {
				int num1 = num2;
				System.out.printf("%2d * %2d = %2d", num1, num, (num1 * num));
			}
			System.out.println();
		}
	}
}
