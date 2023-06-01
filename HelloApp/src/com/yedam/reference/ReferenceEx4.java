package com.yedam.reference;

public class ReferenceEx4 {

	public static void main(String[] args) {
		String[] strAry = {"홍길동", "김민수", "최수민"};
		strAry[0] = "Hong";
		strAry = new String[] {"Hong", "Kim", "Choi"};
		System.out.println(strAry[0]);
		
//		for(String str : strAry) {
//			System.out.println(str);
//		}	
		
		for(int i = 0; i < strAry.length; i++) {
//			System.out.println(strAry[i]);
			if(strAry[i].equals("Kim")) {
				System.out.printf("%s 은 %d 번째에 있습니다.\n", strAry[i], (i+1));
			}
		}
		
		// 문자열의 값에서도 "Hongkildong" index 기준으로 값을 반환
		String s1 = "Hongkildong";
		char result = s1.charAt(4);
		System.out.println(result);
		
		int result1 = s1.indexOf("k");
		System.out.println(result1);
		
		//String 배열에 주민번호, 950304-1234567, 950404-2234567
		String[] idAry = {"950304-1234567", "950404-2234567"};
		
		
		for(int i = 0; i < idAry.length; i++) {
			if(idAry[i].charAt(7) == '1') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
		}
	}

}
