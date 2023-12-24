package basicprograms;

import java.util.Scanner;

public class MatixEqual {
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
		boolean c = matricequal(a,b);
		if(c==true)
		{
			System.out.println("matric are equal");
		}
		else
		{
			System.out.println("matric are not euqal");
		}
	}

	 static boolean matricequal(int[][] a, int[][] b) {

		 int i=0;
		 while(i<a.length)
		 {
			 int j=0;
			 while(j<a[i].length)
			 {
				 if(a[i][j]!=b[i][j])
				 {
					 return false;
					 
				 }
				 j++;
			 }
			 i++;
		 }
		 return true;
	}

}
