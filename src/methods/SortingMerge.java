package methods;

import java.util.Scanner;

public class SortingMerge {
	private static void mergeSort(int[] a, int l, int r) 
	{
		if(l<r)
		{
			
			int mid=(l+r)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			merge(a,l,mid,r);
			
		}
		
	}
	
	
	
	private static void merge(int[] a, int l, int mid, int r) {
		
		
		int n1=mid-l+1;
		int n2=r-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i]=a[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=a[mid+1+j];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
			}
			else {
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k++]=R[j];
			j++;
		}
		
	}
	
	
	



	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the array size");
	   int n = sc.nextInt();
	   int a[]=new int[n];
	   for (int i = 0; i < a.length; i++) {
		   a[i]=sc.nextInt();
		   
		
	   }
	   for (int i = 0; i < a.length; i++) {
		   System.out.print(a[i]+" ");
		   
	   }
	   //mergeSort(a,0,a.length-1);
	   quickSort(a,0,a.length-1);
	   System.out.println();
	   
	   
	   for (int i = 0; i < a.length; i++) {
		   System.out.print(a[i]+" ");
		   
	   }
	  
	}



	private static void quickSort(int[] a, int l, int h) 
	
	{
		
		if(l<h)
		{
			int pivot=partition(a,l,h);
			quickSort(a,l,pivot-1);
			quickSort(a,pivot+1,h);
		}
		
	}



	private static int partition(int[] a, int l, int h) 
	{
		int pivot=a[h];
		int i=l-1;
		for(int j=l;j<h;j++)
		{
			if(a[j]<pivot)
				
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[h];
		a[h]=temp;
				
				
		return i+1;
	}

	

}
