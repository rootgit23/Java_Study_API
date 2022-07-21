package com.im.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		//Calendar calendar = new GregorianCalendar();
		//현재 년 월 일 시 분 초 밀리세컨즈
		Calendar ca = Calendar.getInstance();
		System.out.println(ca);
		ca.set(ca.YEAR, 2002);
		ca.set(ca.MONTH, 11);
		ca.set(ca.DATE, 25);
		int y = ca.get(ca.YEAR);
		int m = ca.get(ca.MONTH);
		int d = ca.get(ca.DATE);
		int h = ca.get(ca.HOUR);
		int min = ca.get(ca.MINUTE);
		int sec = ca.get(ca.SECOND);
		long milis = ca.getTimeInMillis();
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(h);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(milis);
	}

}
