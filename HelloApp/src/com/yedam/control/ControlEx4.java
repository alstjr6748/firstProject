package com.yedam.control;

public class ControlEx4 {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	} // end of main

	// 1 - 1부터 100까지의 수 중에서 3의 배수의 합계 method1()
	public static void method1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 100까지의 수 중에서 3의 배수의 합계 : " + sum);
	} // end of prog
	
	// 2 - Math.random() 의 2번 실행 => 두 수의 합이 5가 되는 경우 => 반복문 중단 method2()

	public static void method2() {
		while (true) {
			int ran1 = (int) (Math.random() * 10);
			int ran2 = (int) (Math.random() * 10);

			if (ran1 + ran2 == 5) {
				System.out.printf("%d, %d, %s", ran1, ran2, "두 수의 합이 5 입니다.");
				break;
			}
		}
	} // end of prog
	
	// 3- 반복문 for 활용 * ** *** **** 쌓 method3()

	public static void method3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.printf("%s" , "*");
			}
			System.out.println();
		}
	} // end of prog
	
	public static void method4() {
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {				
				System.out.printf("%s" , "*");
			}
			System.out.println();
		}
	}
}
