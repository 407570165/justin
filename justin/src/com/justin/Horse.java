package com.justin;

public class Horse extends Thread{
	public Horse(String name) {
		setName(name);
	}
	public void run(){
		for(int i =1;i<=10000;i++) {
			System.out.println(getName()+i);
		}
	}
}
