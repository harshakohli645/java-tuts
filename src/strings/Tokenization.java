package strings;

import java.util.StringTokenizer;

public class Tokenization 
{
	public static void main(String[] args) {
	    StringTokenizer sc = new StringTokenizer("India is My counrty");
	    System.out.println(sc.nextToken());
	    int count=1;
	    while(sc.hasMoreTokens())
	    { 
	    	System.out.println(sc.nextToken());
	    		
	    }
		
	}


}
