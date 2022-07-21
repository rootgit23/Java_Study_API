package com.im.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		//ca.roll(ca.MINUTE, 20);
		ca.add(ca.MINUTE, 20);
		System.out.println(ca.getTime());
		
		System.out.println("===================");
		ca = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String time = sd.format(ca.getTime());
		System.out.println(time);

	}

}
