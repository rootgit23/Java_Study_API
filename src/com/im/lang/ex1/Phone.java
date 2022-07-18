package com.im.lang.ex1;

public class Phone {
	private int price;
	private int size;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Phone p2 = (Phone)obj;
		if(this.price == p2.price && this.size == p2.size) {
			return true;			
		}
		else
			return false;
	}
}
