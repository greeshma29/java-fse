package com.twodarrays;

import java.util.Scanner;

public class matrixApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix matrix=new Matrix();
		matrix.initMatrix();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Display Matrix\n2.Check unit matrix or not\n3.find row additions\nPlease choose :");
		byte ch;
		ch= sc.nextByte();
		if(ch == 1 || ch == 2 || ch == 3) {
			switch(ch) {
				case 1: matrix.display();
						break;
				case 2: boolean b=matrix.isUnit();
						System.out.println(b);
						break;
				case 3: matrix.rowAddition();
						break;
			}
		}
		else
			System.out.println("Choose a valid operation!!!");

	}

}
