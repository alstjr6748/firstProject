package com.yedam.reference;

public class ReferenceEx3 {

	public static void main(String[] args) {
		// 학생점수 : 89.5, 78.9, 90.4 값을 저장. sum, avg 구함
		double[] su = {89.5, 78.9, 90.4};
		float sum = 0;
		float avg = 0;
		double maxVal = su[0];
		
		for(int i = 0; i < su.length; i++) {
			sum += su[i];
			if(su[i] > maxVal) {
				maxVal = su[i];
			}
		}
		
		avg = sum/3;
		System.out.printf("합 : %.1f || 평균 : %.1f || 최고점수 : %.1f" , sum,avg,maxVal);
	}

}
