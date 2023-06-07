package com.yedam.classes;
//라이브러리(역할) 클래스

public class Department {
	private int departmentId; //부서번호
	private String departmentName; //부서명
	private int managerId;			//부서장
	
	//생성자
	Department(){
		
	}
	Department(int departmentId){
		this.departmentId = departmentId;
	}
	//부서번호, 부서명 초기화
	Department(int departmentId, String departmentName){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	//부서번호, 부서명, 부서장 초기화
	Department(int departmentId, String departmentName, int managerId){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	//메소드
	void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	int getDepartmentId() {
		return departmentId;
	}
	String getDepartmentName() {
		return departmentName;
	}
	int getManagerId() {
		return managerId;
	}
	
	//부모클래스의 기능 상속
	@Override
	public String toString() {
//		return super.toString();
		return "부서번호 : " + departmentId + ", 부서명 : " + departmentName + ", 부서장Id : " + managerId;
	}
	
}
