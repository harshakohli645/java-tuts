package basicprograms;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("ente the elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				}
			}
		transpose(a);
		transpose1(a);
		for(int k=0;k<a.length;k++) {//space complexity is o(1);
			for(int m=0;m<a[k].length;m++) {
				 System.out.print(a[k][m]+" ");
			 }
			 System.out.println();
		 }
	}

	  static void transpose1(int[][] a) {
		  for(int i=0;i<a.length-1;i++) {
			  for(int j=i+1;j<a[i].length;j++) {
				  int t=a[i][j];
				  a[i][j]=a[j][i];
				  a[j][i]=t;
			  }
		  }
		
	}

	static void transpose(int[][] a) {
		 int b[][]=new int[a.length][a[0].length];
		 int i=0;
		 while(i<a.length) {
			 int j=0;
			 while(j<a.length) {
				 b[j][i]=a[i][j];
				 j++;
			 }
			 i++;
		 }
		 for(int k=0;k<b.length;k++) {
			 for(int m=0;m<b[k].length;m++) {
				 System.out.print(b[k][m]+" ");
			 }
			 System.out.println();
		 }
	}

}
