package com.im.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService {
	
	private StringBuffer info;
	//private String info;
	
	public WorkerService() {
		
		info = new StringBuffer();
		String str1 = "iu-인사과-과장-0101111";
		String str2 = ", suji-IT부서-대리-0102222";
		String str3 = ", choa-영업부서-부장-0103333";
		String str4 = ", hani-마케팅-사원-0104444";
		info.append(str1);
		info.append(str2);
		info.append(str3);
		info.append(str4);
		
	}
	
	public WorkerDTO [] init() {
		//info 에 있는 데이터를 파싱해서 workerDTO를 만들어 대입하고 이 workerDTO를 모은 배열을 리턴
		String ab = info.toString();
		String a = ab.replace(",", "-");
		StringTokenizer st = new StringTokenizer(a, "-");
		int num = st.countTokens();
		num = num / 4;
		WorkerDTO [] wdto = new WorkerDTO [num];
		int count = 0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			String token1 = st.nextToken();
			String token2 = st.nextToken();
			String token3 = st.nextToken();
			wdto[count] = new WorkerDTO();
			wdto[count].setName(token.trim());
			wdto[count].setDepartment(token1);
			wdto[count].setJob(token2);
			wdto[count].setPhone(token3);
			count++;
		}
		return wdto;
		//String [] b = a.split("-");
		//WorkerDTO [] wdto = new WorkerDTO[st.length()];
		//for(int i=0; i<wdto.length; i=i+4) {
			//wdto[i/4] = new WorkerDTO();
		///	wdto[i/4].setName(b[i].trim());
			//wdto[i/4].setDepartment(b[i+1]);
		//	wdto[i/4].setJob(b[i+2]);
		//	wdto[i/4].setPhone(b[i+3]);
		//}
		//return wdto;
		
	}

}
