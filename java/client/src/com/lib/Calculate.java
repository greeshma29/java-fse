package com.lib;

public class Calculate {
  
  public void reverse(int num) {
	  int n,s=0;
	  while(num!=0) {
		  num=num/10;
		  n=num%10;
		  s=s*10+n;
	  }
  }
  public void word(int num) {
	  int n=0;
	  while(num!=0) {
		  n=(n*10)+(num%10);
		  num=num/10;
	  }
	  while(n!=0) {
		  switch(n%10){
		  case 0: System.out.println("zero");
		  break;
		  case 1: System.out.println("one");
		  break;
		  case 2: System.out.println("two");
		  break;
		  case 3: System.out.println("three");
		  break;
		  case 4: System.out.println("four");
		  break;
		  case 5: System.out.println("five");
		  break;
		  case 6: System.out.println("six");
		  break;
		  case 7: System.out.println("seven");
		  break;
		  case 8: System.out.println("eight");
		  break;
		  case 9: System.out.println("nine");
		  break;
		  }
		  n=n/10;
	  }
  }
  public void expand(int n) {
	  int temp=0,r,r1,c=0;
	  while(n>0) {
		  r=n%10;
		  temp=temp*10+r;
		  n=n/10;
	  }
	  while(temp>0) {
		  r1=temp%10;
		  if(temp>10)
			  System.out.print(r1+"*"+(int)Math.pow(10,c-1)+"+");
			  else
				  System.out.print(r1+"*"+(int)Math.pow(10,c-1));
		  temp=temp/10;
		  c--;
	  }
  }
}
