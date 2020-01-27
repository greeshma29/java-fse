package com.jdbc.javapractice;

import java.util.Scanner;

public class Namecons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("your name is:" );
		String name = sc.nextLine();
		if(!name.matches("^[a-zA-z]*$")) 
		  System.out.println("name should contain only alphabets");
		
			
		System.out.println("your age is:" );
		int age = sc.nextInt();
		
		System.out.println("hello, My name is :" +name+ " , My age is:" +age);
		
		
	}

}
