package numtoword;

import java.util.Scanner;

public class numToWord {
	
       public static void main(String args[]) {
    	   int i;
    	   int num=0;
    	 Scanner sc =new Scanner(System.in);
    	  i=sc.nextInt();
    	  
    	   while(i!=0) { 
    		   num=(num*10)+(i%10);
    		  i=i/10;
    	   }
    	   while(num!=0)
    	   {
    		   switch(num%10)
    		   {
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
    		   num=num/10;
    	   }
       }
}

