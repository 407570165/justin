package com.justin;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Practice {

	public static void main(String[] args) {
		PrintWriter out =null;
		try {
		FileWriter fw =new FileWriter("result.txt");
		out =new PrintWriter(fw);
		out.write("邱至廷");
		out.flush();
		}catch(Exception e) {	
		}finally {
			if(out!=null) {
				out.close();
			}
		}
	}

}
