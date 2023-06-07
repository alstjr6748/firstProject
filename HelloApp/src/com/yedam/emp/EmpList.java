package com.yedam.emp;

import java.util.Scanner;

public abstract class EmpList{
	Scanner sc = new Scanner(System.in);
	abstract void init();						//저장공간 초기화 배열 = new Employee[10]
												//ArrayList = new ArrayList();
	
	abstract void input();						//사원정보입력.
	abstract String search(int employeeId);		//사원정보조회.
	abstract void print();						//사원정보출력.
	
}
