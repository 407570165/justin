package com.justin;

public class Wizard extends Thread{
	public void thunder() {
		try {
			
			System.out.println("THUNDER START");
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("THUNDER END");
	}
	
	
	public void run() {
		thunder();
	}
	public static void main(String[] args) {
		Wizard w1=new Wizard();	
		w1.start();
		try {
			w1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wizard w2 =new Wizard();
		w2.start();
		}

}
