package com.jdk5;


import java.io.FileInputStream;

import java.io.FileOutputStream;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-gener              ated method stub
		try {
			FileInputStream fin = new FileInputStream("abc.txt");
			FileOutputStream fout = new FileOutputStream("xyz.txt");

			if(fin == null) {
				System.out.println("Source file not available!!!");
				System.exit(1);
			}
			int data;
			while((data = fin.read()) != -1) {
				fout.write(data);
			}

			fin.close();
			fout.close();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
