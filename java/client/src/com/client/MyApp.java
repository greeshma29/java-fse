package com.client;
import java.util.Scanner;
import com.lib.*;
public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         // Patterns p = new Patterns();
      //   Calculate cal = new Calculate();
         ArrayImplementation arri= new ArrayImplementation();
          Scanner sc = new Scanner(System.in);
         int  n = sc.nextInt();
       //  int num=sc.nextInt();
         
        //  p.pattern2(n);
         // cal.word(num);
          sc.close();
          arri.average(n);
         
          
	}

}
