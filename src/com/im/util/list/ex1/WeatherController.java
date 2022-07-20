package com.im.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	Scanner sc = new Scanner(System.in);
	WeatherService ws = new WeatherService();
	WeatherView wv = new WeatherView();
	ArrayList<CityDTO> ar = new ArrayList<>();
	CityDTO cityDTO = new CityDTO();
	boolean a = true;
	public void start() {
		//1번 누르면 날씨 정보를 초기화
		//2번 누르면 전국 날씨 출력
		//3번 누르면 지역날씨 검색
		//4번 누르면 지역정보 추가
		//5번 누르면 지역정보 삭제
		//6번 누르면 프로그램 종료
		while(a) {
			System.out.println("1번 날씨 정보 초기화 2번 전국 날씨 출력 3번 지역날씨 검색 4번 지역정보 추가 5번 지역정보 삭제 6번 종료");
			int num = sc.nextInt();
			if(num == 1) {
				ar = ws.init();
				String a = "날씨 정보를 초기화 하였습니다";
				wv.view(a);
			}
			else if(num == 2) {
				wv.view(ar);
			}
			else if(num == 3) {
				cityDTO = ws.find();
				if(cityDTO == null) {
					String a = "일치하는 도시가 없습니다";
					wv.view(a);
				}
				else
					wv.view(cityDTO);
			}
			else if(num == 4) {
				ws.add();
				String a = "지역정보가 추가되었습니다";
			    wv.view(a);
			}
			else if(num == 5) {
				String a = ws.remove();
				wv.view(a);
			}
			else {
				System.out.println("날씨 프로그램 종료");
				break;
			}
		}
	}

}
