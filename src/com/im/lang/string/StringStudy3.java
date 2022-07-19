package com.im.lang.string;

public class StringStudy3 {
	
	public void studySplit3() {
		String info = "서울,대전,대구,부산-제주,광주-강릉";
		String info2 = info.replace("-", ",");
		String [] infos = info2.split(",");
		for(String area : infos) {
			System.out.println(area);
		}
	}
	
	public void studySplit2() {
		String info="1997 12 24";
		String [] age = info.split(" ");
		for(String birth : age) {
			System.out.println(birth);			
		}
	}
	
	public void studySplit() {
		String str = "iu,suji,choa,hani";
		String [] names = str.split(",");
		
		//향상된 for문 for(배열에모은데이터타입 변수명 : 배열참조변수명){}
		for(String name : names) {
			System.out.println(name);
		}
	}

}
