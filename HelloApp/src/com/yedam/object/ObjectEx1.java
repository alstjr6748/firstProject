package com.yedam.object;

import java.util.*;

public class ObjectEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Member[] members = new Member[3];

		
		// 등록

		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();
			System.out.print("아이디를 입력하세요. ==>>");
			m1.memberId = sc.nextLine();
			// i => 0 이면 처음등록
			// i != 0 이면 2번째 등록 1 비교. 동일한 아이디를 체크
			boolean dupId = false;
			if (i != 0) {
				for (int j = 0; j < i; j++) {
					if (members[j].memberId.equals(m1.memberId)) {
						dupId = true;
						break;
					}
				}
				if (dupId) {
					System.out.println("동일한 아이디입니다.");
					i--;
					continue;
				}
			}
			System.out.print("이름을 입력하세요. ==>>");
			m1.memberName = sc.nextLine();
			System.out.print("포인트를 입력하세요. ==>>");
			m1.point = Integer.parseInt(sc.nextLine());

			members[i] = m1;

		}

//		System.out.printf("아이디 : %s, 이름 : %s, point : %d", members[0].memberId, members[0].memberName,
//				members[0].point);
	}

}
