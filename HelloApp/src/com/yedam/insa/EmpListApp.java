package com.yedam.insa;

import java.util.Scanner;

//EmpListApp : main() 실행클래스
//EmpList    : 사원정보 등록, 조회, 출력
//Employee   : 데이터의 입출력을 정보
public class EmpListApp {
	
	
	
	public static void main(String[] args) {
		EmpList app = new EmpList();
		
		//싱글톤 방식
//		EmpList app = EmpList.getInstance();
//		EmpList app1 = EmpList.getInstance();
//		
//		System.out.println(app == app1);
		
		Scanner sc = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("1.사원수 2.사원등록 3.사원목록 4.검색 5. 급여합계 6.종료");
			System.out.print("선택 >>");
			
			selectNo = sc.nextInt();
			if(selectNo == 1) {
				app.init();
			} else if(selectNo == 2) {
				app.input();
			} else if(selectNo == 3) {
				app.print();
			} else if(selectNo == 4) {
				System.out.print("조회할 사번 >>");
				int no = sc.nextInt();
				String name = app.search(no);
				System.out.println("이름은 " + name);
			} else if(selectNo == 5) {
				int sum = app.sum();
				System.out.println("급여합계 : " + sum);
			} else if(selectNo == 6) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
}
