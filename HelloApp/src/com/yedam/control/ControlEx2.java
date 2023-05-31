package com.yedam.control;

public class ControlEx2 {

	public static void main(String[] args) {
		//12월  마지막 날짜값 : 1 => 31, 2 => 28, 3 => 31, 4 => 30 ..
		//월 정보를 입력하면 일 수를 반환
		System.out.println(getLastDate(3));
	}
	public static int getLastDate(int month) {
		int result = 30;
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				result = 31; break;
			case 2:
				result = 28; break;
		}
		
		return result;
	}
	public static void method1() {
		int result = (int)(Math.random() * 3) + 1;
		switch(result) {
			case 1:
				System.out.println("가위");
				break;
			case 2:
				System.out.println("바위");
				break;
			case 3:
				System.out.println("보");
				break;
		}
		System.out.println("end of prog.");
	}
}
