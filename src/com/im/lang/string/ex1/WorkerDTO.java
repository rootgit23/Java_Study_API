package com.im.lang.string.ex1;

public class WorkerDTO {
	
	//멤버변수의 접근지정자
	private String name;
	private String department; //부서
	private String job; //직급
	private String phone;
	
	//생성자는 기본생성자 필수
	
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
