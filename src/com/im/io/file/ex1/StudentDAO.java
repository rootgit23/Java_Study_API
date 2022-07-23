package com.im.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentDAO {
	//DAO : Data Access Object
	//DTO : Data Transfer Object
	// file data에 접근
	
	//2. setList
		public int setList(ArrayList<StudentDTO> ar) {
			File file = new File("C:\\Study\\studentData.txt");
			try {
				FileWriter fw = new FileWriter(file,true);
				for(int i=0; i<ar.size(); i++) {
					StudentDTO scto = ar.get(i); 
					fw.write(scto.getName() + "\n");
					fw.write(scto.getNum() + "\n");
					fw.write(scto.getKor() + "\n");
					fw.write(scto.getEng() + "\n");
					fw.write(scto.getMath() + "\n");
					fw.write(scto.getTotal() + "\n");
					fw.write(scto.getAvg() + "\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				return 0;
			}
			//예외처리는 내부에서 처리
			//List로받은 데이터들을 studentData에다가 작성
			//기존의 내용은 삭제
			//작성 형식은 기존 내용의 형식과 동일하게
			//1을 리턴 : 정상적인 성공
			//0을 리턴 : 예외가 발생 했을 경우
			return 1;
		}
		
		//1. getList
		//   studentData 파일의 내용을 읽어서 작업
		
		public ArrayList<StudentDTO> getList() throws Exception{
			ArrayList<StudentDTO> ar = new ArrayList<>();
			File file = new File("C:\\Study\\studentData.txt");
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			boolean check=true;
			//첫줄 공백 제거
			while(check) { //While 시작
				String data=br.readLine();
				if(data==null) {
					break;
				}
				else {
					StudentDTO sdto = new StudentDTO();
					sdto.setName(data);
					data = br.readLine();
					int a = Integer.parseInt(data);
					sdto.setNum(a);
					data = br.readLine();
					a = Integer.parseInt(data);
					sdto.setKor(a);
					data = br.readLine();
					a = Integer.parseInt(data);
					sdto.setEng(a);
					data = br.readLine();
					a = Integer.parseInt(data);
					sdto.setMath(a);
					ar.add(sdto);
				}
			/*************** StringTokenizer 1 ************			
				StringTokenizer st = new StringTokenizer(data, ",");
				while(st.hasMoreTokens()) {
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken().trim());
					studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
					studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
					studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
					studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
					ar.add(studentDTO);
				}
			//***********************************************/
				
			/*************** StringTokenizer 2 ************
				StringTokenizer st = new StringTokenizer(data, ",");
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(st.nextToken().trim());
				studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
				ar.add(studentDTO);
			//***********************************************/

			/*************** split **************************
				String [] info = data.split(",");
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(info[0]);
				studentDTO.setNum(Integer.parseInt(info[1].trim()));
				studentDTO.setKor(Integer.parseInt(info[2].trim()));
				studentDTO.setEng(Integer.parseInt(info[3].trim()));
				studentDTO.setMath(Integer.parseInt(info[4].trim()));
				ar.add(studentDTO);			
			//***********************************************/			
				
			}//while 끝
			
			return ar;
		}

}
