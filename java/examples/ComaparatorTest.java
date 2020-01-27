package com.jdbc.examples;

import java.util.Arrays;
import java.util.Comparator;

public class ComaparatorTest {
	public static void main(String[] args) {
		String[] ar= {"c","d","b","a","e"};
		InnerClass in = new InnerClass();
		Arrays.parallelSort(ar , in);
		for(String str:ar)
		  System.out.println(str +"");
		System.out.println(Arrays.binarySearch(ar,"b"));
		
	}
   static class InnerClass implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);
		
	}
	   
	   
   }
}
