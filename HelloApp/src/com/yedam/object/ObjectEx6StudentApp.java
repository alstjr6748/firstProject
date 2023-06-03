package com.yedam.object;

import java.util.*;

public class ObjectEx6StudentApp {
	// 학생정보관리 앱 -- 1.등록 2.목록 3.조회(이름)
	// 4. 수정(점수) 5. 학생정보삭제 6. 종료
	// 학생정보 : 학생번호(stuId)_(23-001) . 학생이름(stuName) . 성별(sex)_(남,여) . 점수(stuScore)
	// 점수 - 최고점수와 최고점수의 학생이름 표시.
	// 수정-삭제시 없으면 없다고 표시하기.

	static Student[] students = new Student[3];
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean isTrue = true;
		int selectNo = 0;
		while (isTrue) {
			System.out.println("1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6.종료");
			System.out.print("입력 >> ");
			selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				register();
			} else if (selectNo == 2) {
				list();
			} else if (selectNo == 3) {
				search();
			} else if (selectNo == 4) {
				modify();
			} else if (selectNo == 5) {
				remove();
			} else if (selectNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				isTrue = false;
			}
		}
	}

	public static void register() {
		Student stu = new Student();
		System.out.print("학생번호 입력");
		String stuId = sc.nextLine();
		stu.setStudentId(stuId);

		System.out.print("학생이름 입력");
		String stuName = sc.nextLine();
		stu.setStudentName(stuName);

		while (true) {
			System.out.print("학생성별(남,여) 입력");
			String sex = sc.nextLine();
			stu.setSex(sex);
			if (stu.getSex().equals("남") || stu.getSex().equals("여")) {
				break;
			} else {
				System.out.print("학생성별(남,여) 입력");
				sex = sc.nextLine();
				stu.setSex(sex);
				continue;
			}
		}

		System.out.print("학생점수 입력");
		int stuScore = Integer.parseInt(sc.nextLine());
		stu.setStudentScore(stuScore);
		
		for(int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = stu;
				System.out.println("정상적으로 등록이 되었습니다.");
				break;
			}
		}
	}

	public static void list() { // 목록
		System.out.println("=====================목록=====================");
		
		int max = 0;
		int man = 0;
		int girl= 0;
		int studentMax = 0;
		for(int i = 0; i < students.length; i++) {
			
			if(students[i] != null) {
				max = students[0].getStudentScore();
				if(students[i].getSex().equals("남")) {
					man++;
				} else {
					girl++;
				}
				if(max < students[i].getStudentScore()) {
					max = students[i].getStudentScore();
					studentMax = i;
				}
			}
		}
		
		System.out.printf("남-%d, 여-%d, 최고점수 : %s - %d\n",man,girl,students[studentMax].getStudentName(),max);
	}

	public static void search() { // 조회
		System.out.print("학생이름 입력");
		String stuName = sc.nextLine();
		boolean isTrue = true;
		while(isTrue) {			
			for(int i = 0; i < students.length; i++) {
				if(students[i] != null && students[i].getStudentName().equals(stuName)) {
					System.out.printf("학생번호 : %s | 학생이름 : %s | 학생성별 : %s | 학생점수 : %d\n",students[i].getStudentId(),students[i].getStudentName(),students[i].getSex(),students[i].getStudentScore());
					isTrue = false;
				} 
			}
			if(isTrue) {
				System.out.println("같은 이름이 없습니다");
				return;
			}
		}
	}

	public static void modify() { // 수정
		System.out.print("수정(점수)할 학생의 번호를 입력");
		String stuId = sc.nextLine();
		
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null && students[i].getStudentId().equals(stuId)) {
				System.out.print("수정(점수)할 점수 입력");
				int stuScore = Integer.parseInt(sc.nextLine());
				students[i].setStudentScore(stuScore);
			}
		}
	} // 학생번호 기준으로 수정

	public static void remove() { // 삭제
		
	} // 학생번호 기준으로 삭제
}
