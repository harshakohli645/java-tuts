package strings;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		//System.out.println(countWords(s));
		//System.out.println(reverse(s));
		String[] res = StringToArray(s);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<res.length;i++) {
			System.out.print(reverse(res[i])+" ");
		}
		System.out.println();
		for(int i=res.length-1 ;i>=0;i--) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
		for(int i=res.length-1 ;i>=0;i--) {
			System.out.print(reverse(res[i])+" ");
		}
		System.out.println();
		for(int i=0;i<res.length;i=i+2) {
			System.out.print(res[i+1]+" "+res[i]+" ");
		}
		System.out.println();
		
		String  st=res[0];
		String ed=res[res.length-1];
	
		res[0]=ed;
		
		res[res.length-1]=st;
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
		
			
		
	}
   static  int countWords(String s)


    {
    	int count=0;
    	for(int i=0;i<s.length()-1;i++) {
    		if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
    			count++;
    		}

    	}
    	return s.charAt(0)==' ' ? count: count+1;
    }
   static String  reverse(String s) 
   {
	   String t="";
	   for(int i=s.length()-1;i>=0;i--) 
	   {
		   t=t+s.charAt(i);
	   }
	   return t;
   }
   static String[]StringToArray(String s) 
   {
	   String t="";
	   int j=0;
	   int res=countWords(s);
	   String  a[]=new String[res];
	   for(int i=0;i<s.length();i++)
	   {
		   if(s.charAt(i)!=' ')
		   {
			   t=t+s.charAt(i);
			   
		   }
		   else if(t.length()>0) {
			   a[j++]=t;
			   t="";
		   }
       }
	   a[j]=t;
	  return a;
   }
}
