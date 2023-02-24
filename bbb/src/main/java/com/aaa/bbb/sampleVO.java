package com.aaa.bbb;

public class sampleVO {
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "sampleVO [name=" + name + ", price=" + price + "]";
	}
	
}
