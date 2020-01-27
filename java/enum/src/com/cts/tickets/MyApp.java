package com.cts.tickets;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Theater gold = Theater.GOLD;
     Theater silver = Theater.SILVER;
     Theater platinum = Theater.PLATINUM;
     System.out.println("the cost of gold is:" +Theater.GOLD.getRate());
     System.out.println("the cost of silver is:" +Theater.SILVER.getRate());
     System.out.println("the cost of platinum is:" +Theater.PLATINUM.getRate());
	}

}

