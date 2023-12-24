package arrays;
import java.util.*;
public class Vowels 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
		vowels(name);
	}
    static void vowels(String name)
    {   //String a=" ";
    	
    	for(int i=0;i<name.length();i++)
    	{
    	 if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
    	  {
    		char c=name.charAt(i);
    		c++;
    		 
    		
    		System.out.print( c);
    	  }
    	 else
    	    System.out.print(name.charAt(i));
    	}
    	
    }
}
