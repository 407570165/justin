package com.justin;

public class BrushTeeth implements Runnable{
	public void run() {
		try {
			System.out.println("Brushing teeth");
			Thread.sleep(3000);
			System.out.println("done");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
