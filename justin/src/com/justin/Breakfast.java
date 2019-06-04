package com.justin;

public class Breakfast extends Thread{
	public void run() {
		try {
			System.out.println("Making breakfast");
			Thread.sleep(2000);
			System.out.println("breakfast done");
		} catch (InterruptedException e) {
		}
		
	}
}
