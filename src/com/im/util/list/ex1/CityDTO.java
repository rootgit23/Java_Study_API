package com.im.util.list.ex1;

public class CityDTO {
	//도시의 날씨 정보
	private String name; //도시이름
	private double gion; //기온
	private int hum; //습도
	private String status; //날씨 상태
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGion() {
		return gion;
	}
	public void setGion(double gion) {
		this.gion = gion;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
