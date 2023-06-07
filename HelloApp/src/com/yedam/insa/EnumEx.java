package com.yedam.insa;

public class EnumEx {

	public static void main(String[] args) {
		Student s1 = new Student("23-01", "홍길동", 80, Gender.MON);
		Student s2 = new Student("23-02", "길동", 90, Gender.WOMON);
		Student s3 = new Student("23-03", "홍동", 70, Gender.MON);
		Student s4 = new Student("23-04", "홍길", 60, Gender.WOMON);
		Student[] students = { s1, s2, s3, s4 };

		for (int i = 0; i < students.length; i++) {
			if(students[i].getGender() == Gender.WOMON) {
				System.out.printf("이름은 %s 이고 점수는 %d점 입니다.\n", students[i].getName(), students[i].getScore());
			}
		}
	}

}
