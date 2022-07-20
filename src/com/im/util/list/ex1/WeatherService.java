package com.im.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);
	ArrayList<CityDTO> ar = new ArrayList<>();
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5-85-태풍");
	}
	
	public ArrayList<CityDTO> init() {
		//sb에 있는 데이터를 파싱해서 citydto에 담아 리턴 
		String s = sb.toString();
		s = s.replace(",", "-");
		StringTokenizer st = new StringTokenizer(s,"-");
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();
			String ss = st.nextToken();
			cityDTO.setName(ss);
			String ss1 = st.nextToken();
			double a = Double.parseDouble(ss1);
			cityDTO.setGion(a);
			String ss2 = st.nextToken();
			int b = Integer.parseInt(ss2);
			cityDTO.setHum(b);
			String ss3 = st.nextToken();
			cityDTO.setStatus(ss3);
			ar.add(cityDTO);
		}
		return ar;
	}
	
	public void add() {
		//city정보를 입력받아서 추가
		System.out.println("도시이름을 적어주세요");
		String a = sc.next();
		System.out.println("기온을 적어주세요");
		double b = sc.nextDouble();
		System.out.println("습도를 적어주세요");
		int c = sc.nextInt();
		System.out.println("현재 날씨 상태를 적어주세요");
		String d = sc.next();
		CityDTO cityDTO = new CityDTO();
		cityDTO.setName(a);
		cityDTO.setGion(b);
		cityDTO.setHum(c);
		cityDTO.setStatus(d);
		ar.add(cityDTO);
	}
	
	public String remove() {
		//도시명을 입력받아서 리스트에서 삭제
		System.out.println("삭제할 도시명을 입력해주세요");
		String a = sc.next();
		boolean c = false;
		for(int i=0; i<ar.size(); i++) {
			CityDTO cdto = ar.get(i);
			String b = cdto.getName();
			a = a.toLowerCase();
			b = b.toLowerCase();
			if(a.equals(b)) {
				ar.remove(i);
				c = !c;
			}
		}
		if(c) {
			String d = "일치하는 도시 정보를 삭제했습니다";
			return d;
		}
		else {
			String e = "일치하는 도시가 없습니다";
			return e;
		}
	}
	
	public CityDTO find() {
		//도시명을 입력받아서 리스트에서 검색해서 리턴
		System.out.println("검색할 도시 이름을 입력하세요");
		String a = sc.next();
		boolean c = false;
		CityDTO cdtosearch = new CityDTO();
		for(int i=0; i<ar.size(); i++) {
			CityDTO cdto = ar.get(i);
			String b = cdto.getName();
			a = a.toLowerCase();
			b = b.toLowerCase();
			if(a.equals(b)) {
				cdtosearch = ar.get(i);
				c = !c;
			}
		}
		if(c) {
			System.out.println("일치하는 도시를 찾았습니다");
			return cdtosearch;
		}
		else {
			return null;
		}
	}

}
