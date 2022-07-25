package com.im.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class Server2 {
	
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("짜장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("오늘은 다이어트 안먹어");
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("물");
	}
	
	//getFood
	//Server에서 메시지를 기다림
	//1번이라는 메시지가 오면 점심 메뉴 중 랜덤하게 하나를 client로 리턴
	//2번이 오면 저녁 메뉴 중 랜덤하게 하나를 client로 리턴
	//3번이 오면 프로그램이 종료
	//그외 나머지 번호가 오면 잘못된 번호입니다 전송
	
	public void getFood() throws IOException {
		ServerSocket serverSocket = new ServerSocket(8282);
		System.out.println("클라이언트 접속 기다리는 중");
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 접속 완료");
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		OutputStream os = socket.getOutputStream();//0,1
		OutputStreamWriter ow = new OutputStreamWriter(os);//문자
		BufferedWriter bw = new BufferedWriter(ow);
		Random random = new Random();
		
		while(true) {
			
			String message2 = br.readLine(); 
			int a = Integer.parseInt(message2);
			if(a == 1) {
				String message1 = lunch.get(random.nextInt(5));
				bw.write(message1+"\r\n");
				bw.flush();
			}
			else if(a == 2) {
				String message1 = dinner.get(random.nextInt(5));
				bw.write(message1+"\r\n");
				bw.flush();
			}
			else if(a == 3) {
				String message1 = "프로그램 종료";
				bw.write(message1+"\r\n");
				bw.flush();
				br.close();
				bw.close();
				ir.close();
				ow.close();
				is.close();
				os.close();
				socket.close();
				serverSocket.close();
				break;
			}
			else {
				String message1 = "잘못된 번호입니다";
				bw.write(message1+"\r\n");
				bw.flush();
			}
		}
	}

}
