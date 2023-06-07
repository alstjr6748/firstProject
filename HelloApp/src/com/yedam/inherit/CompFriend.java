package com.yedam.inherit;

//회사친구 : 이름/연락처/회사명/부서정보.
public class CompFriend extends Friend{
	private String company;
	private String department;
	
	public CompFriend() {
		
	}
	public CompFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String showInfo() {
		return "이름은 " + getName() + ", 연락처는 " + getPhone() + ", 회사는 " + company + ", 부서는 " + department;
	}
	
}
