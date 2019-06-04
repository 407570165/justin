package com.justin;

public class Test {

	public static void main(String[] args) {
		Breakfast br=new Breakfast();
		br.start();
		/*try {
			br.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*///這樣會要等早餐運作完才會執行刷牙
		BrushTeeth brush =new BrushTeeth();
		Thread thread =new Thread(brush);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");	
			
	}

}
