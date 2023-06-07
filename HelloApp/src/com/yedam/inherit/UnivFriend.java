package com.yedam.inherit;

//학교친구 : 이름/연락처/학교명/전공.
public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend() {
		super();			//부모클래스의 생성자를 호출한다는 의미.
	}
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override		//Ctrl + Enter 를 하면 생성할 수 있는 게 표시된다.
	public String showInfo() {
		return "이름은 " + getName() + ", 연락처는 " + getPhone() + ", 학교는 " + univ + ", 전공은 " + major;
	}
}
