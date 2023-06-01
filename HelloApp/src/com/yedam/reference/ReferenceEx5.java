package com.yedam.reference;

public class ReferenceEx5 {

	public static void main(String[] args) {
		
		
		// 제일 큰 수 intAry[] 의 첫 번째에 넣는다 (큰 순서대로)
		int[] intAry = new int[4];
		intAry[0] = (int)(Math.random()*100);
		intAry[1] = (int)(Math.random()*100);
		intAry[2] = (int)(Math.random()*100);
		intAry[3] = (int)(Math.random()*100);
		
		for(int i = 0; i < intAry.length; i++) {
			for(int j = 0; j < intAry.length-1; j++) {
				int temp = 0;
				if(intAry[i] < intAry[j + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[j + 1];
					intAry[i + 1] = temp;
				}
			}
		}
	}

}
