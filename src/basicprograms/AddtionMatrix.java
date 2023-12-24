package basicprograms;

import java.util.Scanner;


public class AddtionMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = sc.nextInt();
			}
		
			
	    }
		System.out.println("enter the values");
		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j] = sc.nextInt();
			}
			
			
		}
	//	addMatrix(a,b);
		multipe(a,b);
		
	    
		
	}

	  static void multipe(int[][] a, int[][] b) {
		
		  int k[][]=new int[a.length][a.length];
		 
		  int i=0;
		  while(i<a.length)
		  {
			  int j=0;
			  
			  
			  while(j<a[i].length)
			  {
				  int c=0;
				  int l=0;
				  while(l<a[i].length)
				  {
					  c=c+a[i][l]*b[l][j];
					  l++;

				  }
				  k[i][j]=c;
				  j++;
			  }
			  i++;
		  }
		 for(int p=0;p<k.length;p++)
		 {
			 for(int e=0;e<k[p].length;e++)
			 {
				 System.out.print(k[p][e]+" ");
			 }
			 System.out.println();
		 }
		  
	}

	static void  addMatrix(int[][] a, int[][] b) 
	 {
		 int c[][]=new int [a.length][a.length];
		 int i=0;
		 while(i<a.length)
		 {
			 int j=0,m=0;
			 while(j<a[i].length && m<b[i].length)
			 {
				 c[i][j]=a[i][j]+b[i][m];
				 j++;m++;
			 }
			 i++;
		 }
		 for(int l=0;l<c.length;l++)
		 {
			 for(int p=0;p<c[l].length;p++)
			 {
				 System.out.print(c[l][p]+" ");
			 }
			 System.out.println();
		 }
		
	}
}
