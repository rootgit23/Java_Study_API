package com.im.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//File : 파일이나 폴더의 정보를 담는 클래스
		//     : 실제 파일이나 폴더가 없을 수도 있음
		File file = new File("C:\\Study\\test.txt"); // 폴더명+파일명
		file = new File("C:\\Study", "test.txt"); //parent : 폴더 , child : 파일명 또는 최종 폴더명
		
		//1. 폴더명 경로가 있는 File 객체 이용
		File path = new File("C:\\Study");
		file = new File(path, "test.txt");
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		System.out.println("==========================");
		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		
		file = new File("C:\\Study\\sub"); //확장자가 없으면 폴더
		if(!file.exists()) {
			file.mkdir();
		}
		
		File file2 = new File("C:\\Study\\sub2\\t1");
		//file.mkdir(); 중간에 폴더가 없으면 생성이 안됨
		file2.mkdirs();
		
		//file.delete();
		
		File file3 = new File("C:\\Study\\sub2");
		file2.delete();
		file3.delete(); //폴더를 지울때는 내부에 파일이 없어야 가능
		
	}

}
