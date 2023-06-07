package com.dev.emp;

public class HelloEx {
	public static void main(String[] args) {
		for(String str : args) {
			System.out.println(str);
		}
		
		//동일한 패키지 클래스.
		Hello hello = new Hello();
		
//		hello.name = "Hong";		//private.	클래스 내에서 접근
		hello.age = 20;				//default	동일한 패키지 내에서 접근
		hello.height = 179.0;		//			접근
		
		World world = new World();	//동일한 패키지.
		
		System.out.println("end of prog.");
	}
}
