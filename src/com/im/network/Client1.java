package com.im.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	
	public void send() throws Exception {
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
			System.out.println("Server로 보낼 메시지 입력");
			String message = sc.next();
			//전송
			bw.write(message + "\r\n");
			bw.flush();
			message = message.toLowerCase();
			int b = message.length();
			if (1 == b) {
				char c = message.charAt(0);
				if(c == 'q') {
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
			
			message = br.readLine();
			System.out.println("Server : "+message);
			message = message.toLowerCase();
			int e = message.length();
			if (1 == e) {
				char c = message.charAt(0);
				if( c == 'q') {
					bw.close();
					br.close();
					ow.close();
					ir.close();
					os.close();
					is.close();
					socket.close();
					break;
					
				}
				//자원해제
				
				
			}
		
		}
	}
}


