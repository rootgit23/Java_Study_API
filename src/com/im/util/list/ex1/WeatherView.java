package com.im.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	public void view(ArrayList<CityDTO> ar) {
		//리스트를 받아서 모든 정보 출력
		for(int i=0; i<ar.size(); i++) {
			CityDTO cdto = ar.get(i);
			System.out.println(cdto.getName());
			System.out.println(cdto.getGion());
			System.out.println(cdto.getHum());
			System.out.println(cdto.getStatus());
			System.out.println("====================");
		}
	}
	
	public void view(CityDTO ar) {
		//city하나를 받아서 모든 정보를 출력
		System.out.println(ar.getName());
		System.out.println(ar.getGion());
		System.out.println(ar.getHum());
		System.out.println(ar.getStatus());
	}
	
	public void view(String message) {
		System.out.println(message);
	}

}
