package basicprograms;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int u=a.length;
		int l=0;
		int mid=a.length/2;
		mergesort(a,l,u);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" " );
		}
		
	}

	static void mergesort(int[] a, int l, int u) {
		if(l<u)
		{
			int mid=l+u/2;
			mergesort(a,l,mid);
			mergesort(a,mid+1,u);
			merge(a,l,mid,u);
		}
	}

	 static void  merge(int[] a, int l, int mid, int u) {
		 int n1=mid-l+1;
		 int n2=u-mid;
		 int lf[]=new int[n1];
		 int rt[]=new int[n2];
		 for(int i=0;i<n1;i++)
		 {
			 lf[i]=a[l+i];
		 }
		 for(int i=0;i<n2;i++)
		 {
			 rt[i]=a[mid+1+i];
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 int i=0;
		 int j=0;
		 int k=l;
		 while(i<=mid &&j<=u)
		 {
			 if(a[i]<=a[j])
			 {
				 a[k]=a[i];
				 i++;
			 }
			 else
			 {
				 a[k]=a[j];
				 j++;
			 }
			 k++;
		 }
		 if(i>mid)
		 {
			 while(j<=u)
			 {
				 a[k++]=a[j++];
			 }
		 }
		 else {
			 while(i<=mid) {
				 a[k++]=a[i++];
			 }
		 }
		
			 
	}

}
