package com.im.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	
	//getFood
	//서버 접속후 1번은 점심메뉴 2번은 저녁메뉴 3번은 종료 라는 메시지를 보내줌
	//번호를 입력받아서 Server로 전송
	//받아서 출력
	
	public void getFood() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.34", 8282);
		System.out.println("Server 접속 완료");
		OutputStream os = socket.getOutputStream(); // 0과 1로 만들어줌
		OutputStreamWriter ow = new OutputStreamWriter(os); //문자 1글자
		BufferedWriter bw = new BufferedWriter(ow);
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		while(true) {
			System.out.println("1번 점심메뉴, 2번 저녁메뉴, 3번 종료");
			System.out.println("번호 입력");
			int a = sc.nextInt();
			bw.write(a + "\r\n");
			bw.flush();
			String message = br.readLine();
			System.out.println("Server : "+message);
			if(a == 3) {
				bw.flush();
				br.close();
				bw.close();
				ir.close();
				ow.close();
				is.close();
				os.close();
				socket.close();
				break;
			}
		}
	}

}
