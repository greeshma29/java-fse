package randomnum;
import java.util.*;

public class RandomNum {

	  public static void main(String[] args) {
	    int a;
	    Random r = new Random();
	    for (a = 1; a <=2; a++) {
	      System.out.println(r.nextInt(25));
	    }
	  }
	}

