package com.yedam.emp;

import java.util.ArrayList;

public class EmpArrayList extends EmpList {
	ArrayList employees;

	@Override
	void init() {
		employees = new ArrayList();
	}

	@Override
	void input() {
		System.out.printf("%d 사번 입력 ", employees.size());
		int no = sc.nextInt();
		System.out.print("이름 입력 ");
		String name = sc.next();
		System.out.print("급여 입력 ");
		int salary = sc.nextInt();

		employees.add(new Employee(no, name, salary));
	}

	@Override
	String search(int employeeId) {
		for (int i = 0; i < employees.size(); i++) {
			Employee emp = (Employee) employees.get(i); // (Employee) << 캐스팅하겠다는 의미 (이렇게해야지 사용할 수 있다)
			if (emp.getDepartmentId() == employeeId) {
				return emp.getName();
			}
		}
		return null;
	}

	@Override
	void print() {

		for (int i = 0; i < employees.size(); i++) {
			Employee emp = (Employee) employees.get(i);
			System.out.printf("%5d %10s %7d\n", emp.getDepartmentId(), emp.getName(), emp.getSalary());
		}
	}

}
