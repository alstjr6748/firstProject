package com.yedam.inherit;

import java.util.*;

// 추가/수정/삭제/목록
// 추가 - 친구 : 학교친구(이름,연락처,학교,전공)/회사친구(이름,연락처,회사,부서)/친구(이름/연락처)
// 수정 - 이름조회 => 학교친구:학교,전공 / 회사친구:회사,부서 / 친구:연락처.
// 삭제 - 이름조회 => 삭제.
// 목록 - 
public class FriendExe {
	Friend[] friends = new Friend[10];
	static int num = 0;

	public void execute() {
		Scanner sc = new Scanner(System.in);
		Friend friend = new Friend();
		int selectNo = 0;
		int detailNo = 0;
		boolean isTrue = true;

		while (isTrue) {
			UnivFriend univfriend = new UnivFriend();
			CompFriend compfriend = new CompFriend();
			System.out.println("=======================");
			System.out.println("1.추가 2.수정 3.삭제 4.목록");
			selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				System.out.println("================================");
				System.out.println("1.학교친구추가 2.회사친구추가 3.친구추가");
				detailNo = Integer.parseInt(sc.nextLine());

				if (detailNo == 1) {
					System.out.print("이름입력 => ");
					String name = sc.nextLine();
					System.out.print("연락처입력 => ");
					String tel = sc.nextLine();
					System.out.print("학교명입력 => ");
					String univ = sc.nextLine();
					System.out.print("전공입력 => ");
					String major = sc.nextLine();

					friends[num++] = new UnivFriend(name, tel, univ, major);

				} else if (detailNo == 2) {
					System.out.print("이름입력 => ");
					String name = sc.nextLine();
					compfriend.setName(name);
					System.out.print("연락처입력 => ");
					String tel = sc.nextLine();
					compfriend.setPhone(tel);
					System.out.print("회사명입력 => ");
					String comp = sc.nextLine();
					compfriend.setCompany(comp);
					System.out.print("부서입력 => ");
					String department = sc.nextLine();
					compfriend.setDepartment(department);

					friends[num++] = new CompFriend(name, tel, comp, department);
				} else if (detailNo == 3) {
					System.out.print("이름입력 => ");
					String name = sc.nextLine();
					friend.setName(name);
					System.out.print("연락처입력 => ");
					String tel = sc.nextLine();
					friend.setPhone(tel);

					friends[num++] = new Friend(name, tel);
				} else {
					System.out.println("1~3만 선택가능");
					continue;
				}
			}
			if (selectNo == 2) {
				String info1, info2;
				System.out.print("수정할 이름 입력");
				String name = sc.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].getName().equals(name)) {
						if (friends[i] instanceof UnivFriend) {
							System.out.print("학교명입력 => ");
							info1 = sc.nextLine();
							System.out.print("전공입력 => ");
							info2 = sc.nextLine();

							UnivFriend univ = (UnivFriend) friends[i];
							univ.setUniv(info1);
							univ.setMajor(info2);
							break;
						} else if (friends[i] instanceof CompFriend) {
							System.out.print("회사명입력 => ");
							info1 = sc.nextLine();
							System.out.print("부서입력 => ");
							info2 = sc.nextLine();

							CompFriend comp = (CompFriend) friends[i];
							comp.setCompany(info1);
							comp.setDepartment(info2);
							break;
						} else {
							System.out.print("연락처입력 => ");
							info1 = sc.nextLine();

							Friend friend1 = (Friend) friends[i];
							friend1.setPhone(info1);
							break;
						}
					}
				}
			}
			if (selectNo == 3) {
				String info1, info2;
				System.out.print("삭제할 이름 입력");
				String name = sc.nextLine();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && friends[i].getName().equals(name)) {
						if (friends[i] instanceof UnivFriend) {
							friends[i] = null;
						} else if (friends[i] instanceof CompFriend) {
							friends[i] = null;
						} else {
							friends[i] = null;
						}
					}
				}
			}
			if (selectNo == 4) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null) {
						if(friends[i] instanceof UnivFriend) {							
							System.out.println("학교친구목록");
							System.out.println(friends[i].showInfo());
						} else if(friends[i] instanceof CompFriend) {							
							System.out.println("회사친구목록");
							System.out.println(friends[i].showInfo());
						} else {							
							System.out.println("친구목록");
							System.out.println(friends[i].showInfo());
						}
					}
				}
			}
		}
	}
}
