package strings;

import java.util.Scanner;

public class Index 
{	public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	char c=sc.nextLine().charAt(0);
	int k=sc.nextInt();	
	//int i=indexof(s,c);
	
	
	//System.out.println(i);
	//int j=lastindexof(s,c);
	//System.out.println(j);
	
	  // int m=position(s,c,k);
	  // System.out.println(m);
	System.out.println(s.indexOf('a',2));
	
   }

    static int position(String s, char c, int k) 
    {
    	int count=0;
    	for(int i=0;i<s.length();i++)
    	{
    		
    		if(c==s.charAt(i) )
    		{
    			count++;
    		}
    		if(count==k)
    		{
    			return i;
    		}
    	}
    	return -1;
    }

	static int lastindexof(String s, char c) {
    	
    	for(int i=s.length()-1;i>=0;i--)
    	{
    		if(c==s.charAt(i))
    		{
    			return i;
    		}
    	}
    	return -1;
}

	static int indexof(String s, char c) {
    	for(int i=0;i<s.length();i++)
    	{
    		if(c==s.charAt(i))
    		{
    			return i;
    		}
    	}
    	return -1;
	 
   }
	
    

}
