package com.justin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader in =new BufferedReader(new FileReader("data.txt"));
			String s;
			StringBuilder sb=new StringBuilder();
			while((s=in.readLine())!=null)
				sb.append(s+"\n");
			in.close();
			return;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
