package basicprograms;

import java.util.Scanner;

public class MatrixRoundElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		roundElements(a);
	}

	 static void roundElements(int[][] a) {
		 int i=0;int j=0;
		 for( j=0;j<a[i].length;j++) {
			 System.out.print(a[i][j]+" ");
		 }
		 j=a.length-1;
		 for(i=1;i<a.length;i++) {
			 System.out.print(a[i][j]+" ");
		 }
		 i=a.length-1;
		 for(j=a.length-2;j>=0;j--) {
			 System.out.print(a[i][j]+" ");
		 }
		 j=0;
		 for( i=a.length-2;i>=0;i--) {
			 System.out.print(a[i][j]+" ");
		 }
		 
		
	}
	

}
