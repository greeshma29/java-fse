package com.cts.tickets;

public enum Theater {
	  GOLD,SILVER,PLATINUM;
	
	public int getRate() {
	   
      if(this==GOLD)
    	  return 200;
      
      else  if(this==SILVER)
      return 150;
      
      else 
    	  return 100;
      
}
	 
 }
