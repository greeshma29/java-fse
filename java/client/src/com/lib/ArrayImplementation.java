package com.lib;

public class ArrayImplementation {
public void average(int n) {
	System.out.println("enter no of elements:" +n);
	int[] arr;
	arr = new int[n];
   System.out.println("enter the array numbers:" +arr);
	int avg=0;
	int sum=0;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%5==0) {
			sum=sum+arr[i];
			count++;
		}
	}
	System.out.println(count);
	try {
		avg=sum/count;
	}
	finally{
		System.out.println(+avg);
	}
	
	
	
	
}
}
