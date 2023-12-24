package basicprograms;

import java.util.Scanner;

public class Recursion {
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your phone number in words lowerCase only and sparate with space");
		String s=sc.nextLine();
		String a[]= {"zero","one","two", "three","four","five","six","seven","eight","nine"};
		String b[]= {"doublezero","doubleone","doubletwo", "doublethree","doublefour","doublefive","doublesix","doubleseven","doubleeight","doublenine"};
		String c[]= {"triplezero","tripleone","tripletwo", "triplethree","triplefour","triplefive","triplesix","tripleseven","tripleeight","triplenine"};
		int k[]= {0,1,2,3,4,5,6,7,8,9};
		int k1[]= {00,11,22,33,44,55,66,77,88,99};
		int k2[]= {000,111,222,333,444,555,666,777,888,999};
		String m[]=s.split(" ");
		
		System.out.println(number(a,b,c,m,k,k1,k2));
		
	}

	
		
	

	static String number(String[] a, String[] b, String[] c, String[] m, int[] k, int[] k1, int[] k2) {
		String t="";
		for(int j=0;j<m.length;j++)
		{
			
		
		  for(int i=0;i<a.length;i++) 
		  {
			if(m[j].equals(a[i])) 
			{
				t=t+k[i];
			}
			else if(m[j].equals(b[i]))	
			{	
				
				t=t+k1[i];
			}
			else if(m[j].equals(k2[i])) 
			{
				t=t+k2[i];
			}
				
		  }
		  
			
		
	    }
		return t;
	}
}
