package com.im.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//juminCheck
	//주민번호를 입력받아 
	//ex) 9 7 1 1 2 4 - 1 2 3 4 5 6 7(체크용번호)
	//곱하기
	//    2 3 4 5 6 7   8 9 2 3 4 5
	//   18 + 21 + 4 + 5 + 12 + 28 + 8 + 18 + 6 + 12 + 20 + 30
	//총합 : 192
	// 총합을 11 로 나누어서 나머지를 구함
	//몫은 17 나머지 5
	//나머지를 11에서 뺀 결과 6
	//뺀 결과를 체크용 번호랑 같은지 비교하는데 만약에 위의 연산결과가 2자리 라면 연산결과를 다시 10으로 나눈 나머지와 체크용 번호를 비교
	Scanner sc = new Scanner(System.in);
	public void juminCheck() {
		int total = 0;
		int p = 0;
		System.out.println("주민번호를 입력하세요");
		String s = sc.next();
		char a1 = s.charAt(0);
		StringBuffer sb1 = new StringBuffer();
		sb1.append(a1);
		String a2 = sb1.toString();
		int num1 = Integer.parseInt(a2);
		num1 = num1*2;
		
		char b1 = s.charAt(1);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(b1);
		String b2 = sb2.toString();
		int num2 = Integer.parseInt(b2);
		num2 = num2*3;
		
		char c1 = s.charAt(2);
		StringBuffer sb3 = new StringBuffer();
		sb3.append(c1);
		String c2 = sb3.toString();
		int num3 = Integer.parseInt(c2);
		num3 = num3*4;
		
		char d1 = s.charAt(3);
		StringBuffer sb4 = new StringBuffer();
		sb4.append(d1);
		String d2 = sb4.toString();
		int num4 = Integer.parseInt(d2);
		num4 = num4*5;
		
		char e1 = s.charAt(4);
		StringBuffer sb5 = new StringBuffer();
		sb5.append(e1);
		String e2 = sb5.toString();
		int num5 = Integer.parseInt(e2);
		num5 = num5*6;
		
		char f1 = s.charAt(5);
		StringBuffer sb6 = new StringBuffer();
		sb6.append(f1);
		String f2 = sb6.toString();
		int num6 = Integer.parseInt(f2);
		num6 = num6*7;
		
		char g1 = s.charAt(7);
		StringBuffer sb7 = new StringBuffer();
		sb7.append(g1);
		String g2 = sb7.toString();
		int num7 = Integer.parseInt(g2);
		num7 = num7*8;
		
		char h1 = s.charAt(8);
		StringBuffer sb8 = new StringBuffer();
		sb8.append(h1);
		String h2 = sb8.toString();
		int num8 = Integer.parseInt(h2);
		num8 = num8*9;
		
		char i1 = s.charAt(9);
		StringBuffer sb9 = new StringBuffer();
		sb9.append(i1);
		String i2 = sb9.toString();
		int num9 = Integer.parseInt(i2);
		num9 = num9*2;
		
		char j1 = s.charAt(10);
		StringBuffer sb10 = new StringBuffer();
		sb10.append(j1);
		String j2 = sb10.toString();
		int num10 = Integer.parseInt(j2);
		num10 = num10*3;
		
		char k1 = s.charAt(11);
		StringBuffer sb11 = new StringBuffer();
		sb11.append(k1);
		String k2 = sb11.toString();
		int num11 = Integer.parseInt(k2);
		num11 = num11*4;
		
		char l1 = s.charAt(12);
		StringBuffer sb12 = new StringBuffer();
		sb12.append(l1);
		String l2 = sb12.toString();
		int num12 = Integer.parseInt(l2);
		num12 = num12*5;
		
		total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10 + num11 + num12;
		p = total % 11;
		p = 11 - p;
		
		if(p>=10) {
			p = total % 10;
		}
		
		char m1 = s.charAt(13);
		StringBuffer sb13 = new StringBuffer();
		sb13.append(m1);
		String m2 = sb13.toString();
		int num13 = Integer.parseInt(m2);
		
		if(num13 == p) {
			System.out.println("합법 주민번호");
		}
		else
			System.out.println("불법 주민번호");
		
	}
}
