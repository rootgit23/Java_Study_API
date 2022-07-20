package com.im.lang.string.ex1;

public class WorkerView {
	
	//뷰라는 메서드
	//workerDTO들을 받아서 정보를 출력 
	public void view(WorkerDTO [] x) {
		for(int i=0; i<x.length; i++) {
			System.out.println("이름 : " + x[i].getName());
			System.out.println("부서 : " + x[i].getDepartment());
			System.out.println("직급 : " + x[i].getJob());
			System.out.println("번호 : " + x[i].getPhone());
		}
	}

}
