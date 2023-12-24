package basicprograms;

import java.util.Scanner;

public class RotateMatrix {
	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]=new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		
		}

		
		rotate(a);
	}

	 static void rotate(int[][] a) {
		 int b[][]=new int[a.length][a.length];
		 int i=0;
		 int e=a.length-1;
		 while(i<a.length)
		 {
			 int j=0;
			 while(j<a[i].length)
			 {
				 b[j][e]=a[i][j];
				 j++;
			 }
			 e--;
			 i++;
		 }
		 for (int k = 0; k< a.length; k++) {
				for(int j=0;j<a[k].length;j++) {
					System.out.print(b[k][j]+" ");
				}
				System.out.println();
				
		 }
		
	}

}
