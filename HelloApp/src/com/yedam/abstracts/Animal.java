package com.yedam.abstracts;

public abstract class Animal {
	String kind;

	Animal() {

	}

	Animal(String kind) {
		this.kind = kind;
	}

	void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상메소드 -> 자식클래스에서 반드시 구현
	abstract void sound();
}
