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
import java.util.Scanner;

public class Server1 {
	
	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1 통신 
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		OutputStream os = socket.getOutputStream();//0,1
		OutputStreamWriter ow = new OutputStreamWriter(os);//문자
		BufferedWriter bw = new BufferedWriter(ow);
		while(true) {
			
			String message = br.readLine();
			System.out.println("Clint : "+message);
			message = message.toLowerCase();
			int b = message.length();
			if (b == 1) {
				char c = message.charAt(0);
				if(c == 'q') {
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
			}
			
			//----------------------------------------
			System.out.println("클라이언트로 보낼 메세지 입력");
			message=sc.next();
			message = message.toLowerCase();
			int e = message.length();
			bw.write(message+"\r\n");
			bw.flush();
			if (1 == e) {
				char g = message.charAt(0);
				if( g == 'q') {
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
				//전송
				
			}
			
		}
	}
}
			
			
			

