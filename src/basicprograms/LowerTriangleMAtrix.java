package basicprograms;

import java.util.Scanner;

public class LowerTriangleMAtrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int a[][]=new int[n][n];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		//lowtri(a);
		uptri(a);
			
	}

	  static void uptri(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i>j) {
					System.out.print("0 ");
				}
				else {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	static void lowtri(int[][] a) {
		 for(int i=0;i<a.length;i++)
		 {
			 int k=i+1;
			 for(int j=0;j<=i;j++) {
				 System.out.print(a[i][j]+" ");
			 }
			 while(k<a[i].length)
			 {
				 System.out.print("0"+" ");
				 k++;
			 }
			 System.out.println();
		 }
		 System.out.println();
		
	}
}
