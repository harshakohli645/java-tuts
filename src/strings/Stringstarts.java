package strings;

import java.util.Scanner;

public class Stringstarts 
{	public static void main(String[] args) 
   {
 	Scanner sc = new Scanner(System.in);
 	String s = sc.nextLine();
 	char o=sc.next().charAt(0); 
 	char n=sc.next().charAt(0); 
 	
 	//String t = sc.nextLine();
 	//System.out.println(StartsWith(s,t));
 	//System.out.println(endsWith(s,t));
 	//System.out.println(contains(s,t));
 	System.out.println(replace(s,o,n));
 	
   }



   static String replace(String s, char o, char n) 
   {
	   char []a=new char[s.length()];
	   for(int i=0;i<a.length;i++)
		   
	   {
		   a[i]=s.charAt(i);
	   }
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]==o)
		   {
			   a[i]=n;
		   }
	   }
	   return new String(a);
   }
static boolean contains(String s, String t) {
	
	  int m=0;
	  for(int i=0;i<s.length() && m<t.length();i++)
	  {
		  if(s.charAt(i)==t.charAt(m))
		  {
			 m++; 
		  }
		  else
		  {
			  m=0;
		  }
		  
	  }
	  if(m==t.length())
	
	  {
		  return true;
	  }
	  else
		  
	  {
		  return false;
	  }
		  
	  
	
}



static boolean endsWith(String s, String t) {
     int m=0;
     for(int i=s.length()-t.length();i<s.length();i++)
     {
    	 if(s.charAt(i)!=t.charAt(m))
    	 {
    		 return false;
    	 }
    	 m++;
     }
     return true;
}



static boolean StartsWith(String s, String t) {
	 for(int i=0;i<t.length();i++)
	 {
		 if(s.charAt(i)!=t.charAt(i))
		 {
			 return false;
		 }
	 }
	 return true;
}

}
