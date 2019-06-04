package com.justin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Tester {

	public static void main(String[] args) throws Exception  {
		try {
			FileInputStream fis= new FileInputStream("sales.txt");
			InputStreamReader isr =new InputStreamReader(fis);
			BufferedReader in =new BufferedReader(isr);
			//BufferedReader in =new BufferedReader(new FileReader("sales.txt"));
			String line=in.readLine();//need throws exception
			while(line!=null) {
				System.out.println(line);
				String[] tokens =line.split(" ");
				if(tokens.length==2) {
					System.out.println(tokens[0]+"/"+tokens[1]);
				int n=Integer.parseInt(tokens[1]);
				if(n>10) {
					System.out.println(10000+(n-10)*3000);
				}
				}
				line=in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		/*try {
			FileInputStream fis =new FileInputStream("data.txt");
			Reader in=new InputStreamReader(fis);
			int n =in .read();
			while(n!=-1) {
			System.out.print((char)n);
			n =in.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}

}
