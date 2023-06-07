package com.yedam.emp;
import java.util.*;
public class EmpArray extends EmpList{
	Employee[] employees;
	int empNum;
	
	@Override
	void init() {
		System.out.println("사원 수 입력");
		int num = Integer.parseInt(sc.nextLine());
		employees = new Employee[num];
	}

	@Override
	void input() {
		System.out.printf("%d 사번 입력 ", empNum);
		int no = sc.nextInt();
		System.out.print("이름 입력 ");
		String name = sc.next();
		System.out.print("급여 입력 ");
		int salary = sc.nextInt();
		employees[empNum++] = new Employee(no, name, salary);
	}

	@Override
	String search(int employeeId) {
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null && employees[i].getEmployeeId() == employeeId) {
				return employees[i].getName();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null) {
				System.out.printf("%5d %10s %7d\n",employees[i].getEmployeeId(),employees[i].getName(),employees[i].getSalary());
			}
		}
	}

}
