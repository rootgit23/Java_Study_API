package com.im.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;


public class Service {
	StudentDAO sdao = new StudentDAO();
	ArrayList<StudentDTO> ar = new ArrayList<>();
	StudentDTO sdto = new StudentDTO(); 
	Scanner sc = new Scanner(System.in);
	
	public ArrayList<StudentDTO> getList()throws Exception {
		ar = sdao.getList();
		for(int i=0; i<ar.size(); i++) {
			sdto = ar.get(i);
			sdto.setTotal(sdto.getKor() + sdto.getEng() + sdto.getMath());
			sdto.setAvg(sdto.getTotal() / 3.0);
		}
		return ar;
	}
	//StudentDAO의 getList를 호출하고 총점과 평균을 각각 
	//계산해서 대입하고 그 List를 리턴
	
	public int setList(ArrayList<StudentDTO> ar)throws Exception{
		int check = sdao.setList(ar);
		return check;
	}
	//StudentDAO의 setList를 호출하고
	//그결과를 리턴
	
	public StudentDTO getStudent(ArrayList<StudentDTO> ar)throws Exception{
		System.out.println("찾을려는 학생의 번호를 입력");
		int find = sc.nextInt();
		boolean c = false;
		for(int i=0; i<ar.size(); i++) {
		    sdto = ar.get(i);
			int num = sdto.getNum();
			if (find == num) {
				return sdto;
			}
			else
				continue;
		}
		return null;
	}
	//찾을려고 하는 학생의 번호를 입력 받아서
	//찾은 학생을 리턴
	
	public int setStudnetDelete(ArrayList<StudentDTO> ar)throws Exception{
		System.out.println("삭제하려는 학생의 번호를 입력");
		int delete = sc.nextInt();
		for(int i=0; i<ar.size(); i++) {
		    sdto = ar.get(i);
			int num = sdto.getNum();
			if (delete == num) {
				ar.remove(i);
				return 1;
			}
			else
				continue;
		}
		return 0;
	}
	//삭제하려는 학생의 번호를 입력 받아서
	//일치하는 학생을 삭제
	//삭제가 성공하면 1을 리턴, 실패 0을리턴
	
	public void setStudentAdd(ArrayList<StudentDTO> ar)throws Exception {
		System.out.println("추가하려는 학생의 이름 입력");
		String s = sc.next();
		System.out.println("추가하려는 학생의 번호 입력");
		int s1 = sc.nextInt();
		System.out.println("추가하려는 학생의 국어점수 입력");
		int s2 = sc.nextInt();
		System.out.println("추가하려는 학생의 영어점수 입력");
		int s3 = sc.nextInt();
		System.out.println("추가하려는 학생의 수학점수 입력");
		int s4 = sc.nextInt();
		StudentDTO sdto = new StudentDTO();
		sdto.setName(s);
		sdto.setNum(s1);
		sdto.setKor(s2);
		sdto.setEng(s3);
		sdto.setMath(s4);
		sdto.setTotal(sdto.getKor() + sdto.getEng() + sdto.getMath());
		sdto.setAvg(sdto.getTotal() / 3.0);
		ar.add(sdto);
	}
	//학생 한명을 추가

}
