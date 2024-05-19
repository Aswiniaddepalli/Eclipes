package com.streamApi;

public class StreamsDemo {
	String name;
	int price;
	int no_of_pic;
	public StreamsDemo(String name, int price, int no_of_pic) {
		this.name = name;
		this.price = price;
		this.no_of_pic = no_of_pic;
	}
	@Override
	public String toString() {
		return "StreamsDemo [name=" + name + ", price=" + price + ", no_of_pic=" + no_of_pic + "]";
	}
	
	

}
