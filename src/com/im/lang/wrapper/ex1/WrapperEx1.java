package com.im.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	//Ex1메서드
	//주민번호 입력 : 6자리~7자리 : 971224-1234567
	//1. 남자냐 여자냐를 판단
	//2. 현재 나이 출력
	//3. 3~5월 사이에 태어났으면 봄
	//4. 6~8월 사이에 태어났으면 여름
	//5. 9~11월 사이에 태어났으면 가을
	//6. 12월~2월 사이에 태어났으면 겨울 출력
	Scanner sc = new Scanner(System.in);
	public void Ex1() {
		System.out.println("주민번호를 입력하세요");
		String s = sc.next();
		char o = s.charAt(7);
		String ss = s.substring(0, 2);
		char m = s.charAt(2);
		String ss1 = s.substring(2,4);
		char m1 = s.charAt(3);
		int num = Integer.parseInt(ss);
		int num1 = Integer.parseInt(ss1);
		if(o == '1' || num == '3') {
			System.out.println("남자입니다");
			if(o == '1') {
				num = num+1900;
			}
			else
				num = num+2000;
		}
		else
			System.out.println("여자입니다");
			if('o' == 2) {
				num = num + 1900;
			}
			else if('o' == 4)
				num = num + 2000;
		int age = 2023 - num;
		System.out.println("나이 : " + age);
		if(m == '1' || m == '2') {
			if(num1 == 10 || num1 == 11) {
				System.out.println("가을에 태어났습니다");
			}
			else
				System.out.println("겨울에 태어났습니다");
		}
		else
			if(m1 == '1' || m1 == '2') {
				System.out.println("겨울에 태어났습니다");
			}
			else if(m1 == '3' || m1 == '4' || m1 == '5') {
				System.out.println("봄에 태어났습니다");
			}
			else if(m1 == '6' || m1 == '7' || m1 == '8') {
				System.out.println("여름에 태어났습니다");
			}
			else
				System.out.println("가을에 태어났습니다");
		
	}
}
