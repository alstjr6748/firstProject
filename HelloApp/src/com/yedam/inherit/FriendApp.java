package com.yedam.inherit;

//친구의 정보를 저장.	이름/연락처/ 	==> Friend	
//학교친구 - 이름/연락처/학교이름/전공	==> UnivFriend
//회사친구 - 이름/연락처/회사이름/부서	==> CompFriend
public class FriendApp {

	public static void main(String[] args) {
		FriendExe exe = new FriendExe();
		exe.execute();
	}
	public static void method() {
		Friend[] friends = new Friend[10];
//		UnivFriend[] univs = new UnivFriend[10];
		
		
		friends[0] = new Friend("홍길동", "010-1111");
		friends[1] = new UnivFriend("김민기", "010-2222","대구대","역사학과");
		friends[2] = new CompFriend("박호섭", "010-3333","네이버","개발부서");
		
		for(Friend friend : friends) {
			if(friend != null) {
				System.out.println(friend.showInfo());
			}
		}
	}

}
