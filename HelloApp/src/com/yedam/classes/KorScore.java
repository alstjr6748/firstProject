package com.yedam.classes;

// 점수를 담기위해 배열선언 int[] --> 필드
// 기능 --> 전체정보출력. 합계출력. 최댓값출력.
public class KorScore {
	// 필드.
	int[] kor = new int[] { 100, 80, 70 };
	
	//생성자 기본생성자 KorScore()
	
	//메소드
	public void print() {
		for (int score : kor) {
			System.out.println(score);
		}
	}

	public void total() {
		int sum = 0;
		for (int score : kor) {
			sum += score;
		}
		System.out.println(sum);
	}

	public void max() {
		int max = 0;
		for (int score : kor) {
			if (max < score) {
				max = score;
			}
		}
		System.out.println(max);
	}
}
