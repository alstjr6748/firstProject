package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {

	public static void main(String[] args) {
		// 기본입력
		System.out.println("값 입력");
		while(true) {
			String str = "";
			try {
				int result = System.in.read();
				if(result == 113) {
					System.out.println("113입력으로 인한 종료");
					break;
				}
				if(result == 13 || result == 10) {
					continue;
				}
				if(result >= 97 && result <= 122) {
					str = "소문자";
				} else if(result >= 65 && result <= 90) {
					str = "대문자";
				} else if(result >= 48 && result <= 57) {
					str = "숫자";
				} else {
					str = "기타값";
				} 
				System.out.println(str);
			} catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("끝.");
		}
		
	}

}
