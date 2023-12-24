package methods;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int []a=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();			
		}
		//selectionSort(a);
		//insertionSort(a);
		
	}

	static void selectionSort(int[] a) {
		
		for(int i=0;i<a.length;i++)
		{
			
			int temp=a[i];
			int min=i;
			
		
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[min])
				{
					min=j;
					
				}
			}
			
			a[i]=a[min];
			a[min]=temp;
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}

	private static void insertionSort(int[]a) {
		int j=0;
		for(int i=1;i<a.length;i++)
		{
			j=i-1;
			int key=a[i];
			while(j>= 0 && a[j]<a[key])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
		
		
	}

}
