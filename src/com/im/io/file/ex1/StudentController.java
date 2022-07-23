package com.im.io.file.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		StudentDTO sdto = new StudentDTO();
		Service service = new Service(); 
		StudentView sv = new StudentView();
		public void start() {
			Scanner sc = new Scanner(System.in);
			try {
				ar = service.getList();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while(true) {
				System.out.println("1.학생정보출력");
				System.out.println("2.학생정보검색");
				System.out.println("3.학생정보추가");
				System.out.println("4.학생정보삭제");
				System.out.println("5.백     업");
				System.out.println("6.종     료");
				int select = sc.nextInt();
				if(select == 1) {
					try {
						int num = service.setList(ar);
						if(num == 1) {
							sv.view(ar);
						}
						else
							sv.view("실패");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(select == 2) {
					try {
						int num = service.setList(ar);
						if(num == 1) {
							sdto = service.getStudent(ar);
							sv.view(sdto);
						}
						else
							sv.view("실패");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(select == 3) {
					try {
						service.setStudentAdd(ar);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(select == 4) {
					try {
						int a = service.setStudnetDelete(ar);
						if(a==1) {
							sv.view("삭제 성공");
						}
						else {
							sv.view("삭제 실패");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(select == 5) {
					File file = new File("C:\\Study", "studentData.txt");
					try {
						FileWriter fw = new FileWriter(file, false);
						for(int i=0; i<ar.size(); i++) {
							sdto = ar.get(i);
							fw.write(sdto.getName() + "\n");
							fw.write(sdto.getNum() + "\n");
							fw.write(sdto.getKor() + "\n");
							fw.write(sdto.getEng() + "\n");
							fw.write(sdto.getMath() + "\n");
							fw.write(sdto.getTotal() + "\n");
							fw.write(sdto.getAvg() + "\n");
							fw.flush();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					String s = "프로그램 종료";
					sv.view(s);
					break;
				}
			}
		}
		//start 메서드
		//1. 학생정보출력 - 모든 학생정보 출력
		//2. 학생정보검색 - 
		//3. 학생정보추가
		//4. 학생정보삭제
		//5. 백      업 - 
		//6. 종      료
}
