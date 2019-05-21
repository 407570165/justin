package com.justin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Sales {

	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("sales.txt");
			InputStreamReader isr=new InputStreamReader(fis);
			BufferedReader in =new BufferedReader(isr);
			String line =in.readLine();
			while(line!=null) {
				System.out.println(line);
				String[] tokens=line.split(" ");
				if(tokens.length==2) {
					System.out.println(tokens[0]+"/"+tokens[1]);
				}
				int n =Integer.parseInt(tokens[1]);
				if(n/10>1) {
					int money=(10000+(n/10-1)*30000);
					System.out.println("get:"+money);
				}
				line=in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			
		}
		
	}

}
