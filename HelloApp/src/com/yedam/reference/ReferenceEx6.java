package com.yedam.reference;
import java.util.*;
public class ReferenceEx6 {

	public static void main(String[] args) {
		// 학생3명 - 홍길동의 영어, 수학 --김길동 --박길동
		int[][] intAry = {
				new int[] {80,90},	//홍길동 영어 수학 점수
				new int[] {85,95},	//김길동 영어 수학 점수
				new int[] {70,80}	//박길동 영어 수학 점수
		};
//		intAry[0] = new int[] {22,33};
		System.out.printf("홍길동의 영어점수 %d \n",intAry[0][0]);
		int engSum = 0;
		int mathSum = 0;
		for(int i = 0; i < intAry.length; i++) {
			engSum += intAry[i][0];
			mathSum += intAry[i][1];
		}
		System.out.printf("3명의 영어점수합 : %d || 수학점수합 %d \n",engSum,mathSum);
		
		int totalSum = 0;
		
		for(int i = 0; i < intAry.length; i++) {
			for(int j = 0; j < intAry[j].length; j++) {				
				totalSum += intAry[i][j]; 
			}
		}
		System.out.printf("3명의 총 합 : %d \n",totalSum);
		
		String[] nameAry = {"홍길동", "김길동", "박길동"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름 : ");
		String searchName = sc.nextLine();
		
		for(int i = 0; i < nameAry.length; i++) {
			if(searchName.equals(nameAry[i])) {				
				System.out.printf("%s 의 영어점수는 %d, 수학점수는 %d\n",nameAry[i], intAry[i][0], intAry[i][1]);
			} else {
				System.out.println("찾는 학생 없음");
				break;
			}
		}
		
	} //end of main().

}
