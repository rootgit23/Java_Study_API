package com.im.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
		public void view(String s) {
			System.out.println(s);
		}
		public void view(StudentDTO sdto) {
			System.out.println(sdto.getName());
			System.out.println(sdto.getNum());
			System.out.println(sdto.getKor());
			System.out.println(sdto.getEng());
			System.out.println(sdto.getMath());
			System.out.println(sdto.getTotal());
			System.out.println(sdto.getAvg());
		}
		public void view(ArrayList<StudentDTO> ar) {
			for(int i=0; i<ar.size(); i++) {
				StudentDTO scto = ar.get(i);
				System.out.println(scto.getName());
				System.out.println(scto.getNum());
				System.out.println(scto.getKor());
				System.out.println(scto.getEng());
				System.out.println(scto.getMath());
				System.out.println(scto.getTotal());
				System.out.println(scto.getAvg());
			}
		}
		//view 3개
		//1. String 출력
		//2. StudentDTO 출력
		//3. ArrayList<StudentDTO> 출력

}
