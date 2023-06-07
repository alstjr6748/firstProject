package com.yedam.insa;

import java.util.Calendar;

public class CalendarEx {
	
	static int year;
	static int month;
	
	static void set(int year, int month) {
		 CalendarEx.year = year;
		 CalendarEx.month = month - 1;
	}
	static void cal() {
		Calendar cal = Calendar.getInstance();
		cal.set(CalendarEx.year, CalendarEx.month, 1);
		
		int firstDate = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		
		System.out.println(days);
		System.out.println("===========================");
		for(int i = 0; i < firstDate; i++) {			
			System.out.printf("%3s ", "");
		}
		
		for(int day = 1; day <= lastDate; day++) {
			System.out.printf("%3d ", day);
			if((firstDate + day) % 7 == 0) {
				System.out.println();
			}
		}
		
	}
}
