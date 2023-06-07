package com.yedam.emp;
import java.util.*;
//배열 > 컬렉션
class Member {
	private String memberId;
	private String memberName;
	private int score;
	
	Member(String memberId, String memberName, int score){
		this.memberId = memberId;
		this.memberName = memberName;
		this.score = score;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
public class ArrayExe {
	public static void main(String[] args) {
		ArrayList members = new ArrayList();
		members.add(new Member("001", "홍길동", 100));
		members.add(new Member("002", "김길동", 200));
		
		for(int i = 0; i < members.size(); i++) {
			Member member = (Member)members.get(i);
			if(member.getMemberName().equals("홍길동")) {
//				members.remove(i);
				members.set(i, new Member("010","김민식", 150));
			}
		}
		
		ArrayList arry = new ArrayList();
		arry.add("홍길동");
		arry.add("김길동");
		arry.add("박길동");
//		arry.add(new Integer(100));
		
		for(int i = 0; i < arry.size(); i++) {
			System.out.println(arry.get(i));
		}
		
//		for(String name : arry) {
//			System.out.println(name);
//		}
	}
}
