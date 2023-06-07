package com.yedam.insa;

import java.util.Calendar;

//CalendarEx.set(int year, int month) => static
//CalendarEx.cal() => 년, 월, -> 달력 그려주는 메소드. => static 메소드.
public class CalendarExe {

	public static void main(String[] args) {

//		Calendar cal = Calendar.getInstance();
//		cal.set(2023, 7, 5);
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		CalendarEx.set(2023, 6);
		CalendarEx.cal();
	}

}
