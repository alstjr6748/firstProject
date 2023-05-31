package com.yedam.reference;

public class ReferenceEx1 {

	public static void main(String[] args) {
		int age = 25;
		double price = 100.5;
		
		int age1 = age;
		age = 30;
		System.out.println("age : " + age + " age1 : " + age1);
		
		String name = "홍길동";
		String name1 = name;
		name1 = "김길동";
		String hobby = "독서";
		System.out.println("name : " + name + " name1 : " + name1);
		
	}

}
