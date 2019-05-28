package com.justin;

public class Main {

	public static void main(String[] args) {
		Horse h =new Horse("H1: ");
		h.start();
		Horse h1 =new Horse("H2: ");
		h1.start();
		/*HorseRunnable hr=new HorseRunnable();
		Thread thread =new Thread(hr);
		thread.start();*/
		System.out.println("main end");
	}

}
