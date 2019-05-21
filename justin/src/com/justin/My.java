package com.justin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class My {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			FileInputStream fis =new FileInputStream("data.txt");
			int n =fis.read();
			try {
			while(n!=-1) {
				System.out.println((char)n);
				n=fis.read();
			}
			}catch(Exception e ) {
				
			}finally {
				if(fis!=null ) {
					try {
					fis.close();
				}catch(Exception e) {
					
				}
				}
			}
			}
	}

	

