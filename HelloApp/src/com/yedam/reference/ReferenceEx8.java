package com.yedam.reference;
import java.util.*;
public class ReferenceEx8 {

	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수출력, 최고점수, 평균점수.
		Scanner sc = new Scanner(System.in);
		
		int studentNum = 0;		// 학생수 지정.
		int[] scores = null;	// scores = new int[3] <== 학생을 3명 입력하겠다하면 이렇게 해야함
		boolean run = true;
		int su = 0;
		int max = 0;
		double sum = 0;
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 학생수 2. 점수입력  3. 점수리스트 4. 분석(최고, 평균) 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());	//입력한 문자를 숫자로 반환
			
			if(selectNo == 1) {
				System.out.print("학생 수 >");
				studentNum = Integer.parseInt(sc.nextLine());
			} else if(selectNo == 2) {	//배열의 크기만큼 학생의 점수입력
				scores = new int[studentNum];
				for(int i = 0; i < scores.length; i++) {
					System.out.print("점수입력");
					su = Integer.parseInt(sc.nextLine());
					scores[i] += su;
				}
			} else if(selectNo == 3) {	//배열의 점수 출력
				for(int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
			} else if(selectNo == 4) {	//분석 : 최고, 평균
				for(int i = 0; i < scores.length; i++) {
					if(scores[i] > scores[0]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.printf("분석 : 최고 - %d || 평균 - %.1f \n", max, (sum/scores.length));
			} else if(selectNo == 5) {	//종료 : 프로그램을 종료합니다.
				run = false;
			} else {
				System.out.print("1~5 에 해당하는 값만 넣어주세요");
				continue;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
