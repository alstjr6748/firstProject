package com.yedam.reference;

public class ReferenceEx2 {

	public static void main(String[] args) {
		int[] intAry = {30,40,50};
		double[] dblAry = {30, 40, 50};
		String[] strAry = {"H","E","L","L","O"};
		int[] intAry2 = new int[3];
		
		System.out.println(intAry[0]);
		intAry[0] = 33;
		System.out.println(intAry[0]);
		
		int sum = intAry[0] + intAry[1] + intAry[2];
		sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += intAry[i];
		}
		for(String str : strAry) {
			System.out.println(str);
		}
		System.out.println("sum : "+sum);
		double sum1 = dblAry[0] + dblAry[1] + dblAry[2];
	}

}
