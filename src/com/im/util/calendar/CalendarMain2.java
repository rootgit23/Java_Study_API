package com.im.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, 2000);
		birth.set(Calendar.MONTH, 8);
		birth.set(Calendar.DATE, 18);
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		long result = n-b;
		System.out.println(result/(1000*60*60*24));
		long result2 = 1000*60*60*24;
		System.out.println(result/(result2*365));
		
		Date date = now.getTime();
		System.out.println(date);
	}

}
