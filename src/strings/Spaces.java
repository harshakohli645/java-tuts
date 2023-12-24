package strings;

import java.util.Scanner;

public class Spaces 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.println(trim(s));
		System.out.println(removespaces(s));
	}

	  

      static String removespaces(String s) {
    	  String t="";
 		 int S=0,e=0;
 		 for(int i=0;i<s.length();i++)
 		 {
 			 if(s.charAt(i)!=' ')
 			 {
 				 S=i;
 				 break;
 			 }
 			 
 		 }
 		 for(int i=s.length()-1;i>=0;i--)
 		 {
 			 if(s.charAt(i)!=' ')
 			 {
 				 e=i;
 				 break;
 			 }
 			 
 		 }
 		 for(int i=S;i<=e;i++)
 		 {
 			   char c=s.charAt(i);
    		  if(c==' '&& s.charAt(i+1)!=' ')
    		  {
    			  t=t+c;
    		  }
    		  else if(c!=' ')
    		  {
    			  t=t+c;
    		  }
    			  
    			  
    	  }
 		 return t;
	}



	static String trim(String s) 
	 {
		 String t="";
		 int S=0,e=0;
		 for(int i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)!=' ')
			 {
				 S=i;
				 break;
			 }
			 
		 }
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 if(s.charAt(i)!=' ')
			 {
				 e=i;
				 break;
			 }
			 
		 }
		 for(int i=S;i<=e;i++)
		 {
			 t=t+s.charAt(i);
		 }
		 return t;
		 
		 
		 
	}
	
}
