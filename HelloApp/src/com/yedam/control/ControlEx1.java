package com.yedam.control;

public class ControlEx1 {

	public static void main(String[] args) {
		// 0 ~ 1 사이의 임의의 수를 생성
//		int result = (int)(Math.random()*10);
//		System.out.println(result);
//		if(result % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
		//Math.random 을 활용해서 10 ~ 100 까지의 임의의 수
		//생성된 값이 100 ~ 90 사이면 A 출력
		//			80 ~ 89 사이면 B 70점대 C 69이하 D
		
		int ran = (int)(Math.random()* 91) + 10;
		String grade = "";
		while(true) {
			if(ran >= 90) {
				grade = "A";	
			} else if(ran >= 80) {
				grade = "B";
			} else if(ran >= 70) {
				grade = "C";
			} else {
				grade = "D";
			}
			System.out.println("랜덤점수는 : " + ran + "이고 등급은 : " + grade);
			break;
		}
		
		
	}

}
