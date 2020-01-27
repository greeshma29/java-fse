package com.jdbc.javapractice;

public class Swap {
    public static void main(String[] args) {
    	int a=10,b=20;
    	int temp;
    	System.out.println("the value of a is" +a);
    	System.out.println("the value of b is" +b);
    	temp=a;
    	a = b;
    	b = temp;
    	System.out.println("the value of a is" +a);
    	System.out.println("the value of b is" +b);
    }
}
