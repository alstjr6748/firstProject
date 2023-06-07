package com.yedam.insa;
import java.util.*;
//사원정보 배열, 등록/조회/출력 정의.
public class EmpList {
	
	//싱글톤
	private static EmpList instance = new EmpList();
	
	public static EmpList getInstance() {
		return instance;
	}
	
	//정보저장공간.
	Employee[] list;
	int empNum;			//사원수
	Scanner sc = new Scanner(System.in);
	
	//생성자
	EmpList() {
		
	}
	EmpList(Employee[] list){
		this.list = list;
		this.empNum = list.length;
	}
	//초기화
	public void init() {
		System.out.print("사원수 >>");
		int num = sc.nextInt();
		list = new Employee[num];
	}
	//등록
	public void input() {
		if(empNum >= list.length) {
			System.out.println("입력초과.");
			return;
		}
		System.out.printf("%d 사번 >>", empNum);
		int no = sc.nextInt();
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("급여 >>");
		int sal = sc.nextInt();
		
		list[empNum++] = new Employee(no,name,sal);
		
	}
	//조회
	public String search(int employeeId) {
		for(int i = 0; i < list.length; i++) {			
			if(list[i].getEmployeeId() == employeeId) {
				return list[i].getName();
			}
		}
		return "";
	}
	//전체 출력
	public void print() {
		for(int i = 0; i < list.length; i++) {
			System.out.printf("%5d %10s %7d\n",list[i].getEmployeeId(),list[i].getName(), list[i].getSalary());
		}
	}
	//급여 합계
	public int sum() {
		int sum = 0;
		for(int i = 0; i < list.length; i++) {
			sum += list[i].getSalary(); 
		}
		return sum;
	}
	
	
	
	
}