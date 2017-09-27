package com.springcore;

public class HelloWorld {

	String message1;
	
	
	
	public void init(){
		System.out.println("initialization method called");
	}
	
	public void destroy(){
		System.out.println("destory method called");
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}
}
