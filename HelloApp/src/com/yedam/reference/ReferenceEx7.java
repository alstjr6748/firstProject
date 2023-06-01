package com.yedam.reference;

public class ReferenceEx7 {

	public static void main(String[] args) {
		// 학교의 키, a반(2), b반(4), c반(3)
		double[][] heightAry = {
				{173.5, 168.3},
				{173.9, 178.8,190.3,186.1},
				{188.5, 176.9,158.9}
		};
		System.out.println(heightAry[1].length);
		
		//각반별로 키의 평균
		
		for(int i = 0; i < heightAry.length; i++) {
			double sum = 0;
			for(int j = 0; j < heightAry[i].length; j++) {
				sum += heightAry[i][j];
			}
			String fmt = "%d번째반의 평균키 : %.1f \n";
			System.out.printf(fmt, (i + 1), (sum / heightAry[i].length));
		}
	}

}
