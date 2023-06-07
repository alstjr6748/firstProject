package com.yedam.abstracts;

public abstract class Dao {
	void start() {
		System.out.println("dmbs 시작합니다");
	}
	void stop() {
		System.out.println("dmbs 종료합니다");
	}
	abstract void add();
	abstract void modify();
	abstract void remove();
	
}
