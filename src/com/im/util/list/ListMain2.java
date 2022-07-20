package com.im.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		
		ListView listView = new ListView();
		ArrayList<String> ar = new ArrayList<>();
		ar.add("first");
		//ar.add(2);//Integer로 auto boxing
		//ar.add('c');//Character로 auto boxing
		//ar.add(2.123);//Double로 auto boxing
		//ar.add(null);
		listView.view(ar);
		
		//get -> 특정 index의 요소를 반환
		String n1 = ar.get(0);
		//int n2 = (int)ar.get(1); //auto unboxing int가 아니라 Integer로 안써도 자동 인식
		//char n3 = (char)ar.get(2);
		//double n4 = (double)ar.get(3);
		
		System.out.println(ar.get(0) instanceof String);
		
		System.out.println(n1);
		//System.out.println(n2);
		//System.out.println(n3);
		//System.out.println(n4);
	}

}
