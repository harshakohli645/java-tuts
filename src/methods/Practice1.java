package methods;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[7];
		for(int i=0;i<a.length;i++)
		{
		    a[i] = sc.nextInt();
		}
		//negative(a);
		sort(a);
		
	}

	 static void sort(int[] a) {
		 for(int i=0;i<a.length-1;i++)
		 {
			 for(int j=0;j<a.length-1;j++)
			 {
				 if(a[j+1]<a[j])
				 {
					 int temp=a[j+1];
					 a[j+1]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 for (int i = 0; i < a.length; i++) {
			 System.out.print(a[i]+" ");
			
		}
		
	}

	static void negative(int[] a) {
		 for(int i=0;i<a.length-1;i++)
		 {
			 for(int j=0;j<a.length-1;j++)
			 {
				 if(a[j+1]>0 && a[j]<0)
				 {
					 int r=a[j];
					 a[j]=a[j+1];
					 a[j+1]=r;
				 }
			 }
		 }
		 for (int i = 0; i < a.length; i++) {
			 System.out.print(a[i]+" ");
			
		}
		
	}

}
