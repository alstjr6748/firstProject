package com.yedam.control;

public class ControlEx5 {

	public static void main(String[] args) {
		// while, do while
		boolean isTrue = false;
		int sum = 0;
		int cnt = 0;
		
		do {
			System.out.println("do print");
			int result = (int)((Math.random() * 6) + 1);
			sum += result;
			if(sum > 100) {
				isTrue = false;
			}
		} while(isTrue);
		
		System.out.println("평균 : " + (sum * 1.0 / cnt));

	}

}
