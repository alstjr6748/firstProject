package com.yedam.variable;

public class VariableEx1 {

	public static void main(String[] args) {
		//변수 : 변하는 값을 저장. 컴퓨터의 메모리에 저장 공간에 값을 저장
				int num1;	//음의 정수, 0, 양의 정수
				num1 = 100;
				num1 = -100;
				
				double num2 = -1.2;
				num2 = 12.3;
				num2 = 123;	// 정수 -> 실수 내부적으로 형변환이 일어남 ( 123.0)
				
				double result = 0;
				result = (double)num1 + num2;	//변수의 범위가 int 보다 double 이 훨씬 큼
				System.out.println(result);

	}

}
