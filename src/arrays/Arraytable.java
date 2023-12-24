package arrays;
import java.util.*;
public class Arraytable 
{
	static void arraytable(int[][]n)
	{
		System.out.println("-------------");
		for(int i=0;i<n.length;i++)
		{
			System.out.print("| ");
			for(int j=0;j<n.length;j++)
			{
				System.out.print(n[i][j]+" ");
				System.out.print("| ");
			}
			System.out.println();
			System.out.println("-------------");
			
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		int [][]a=new int[n][n];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{	
				a[i][j]=sc.nextInt();
			}
		}
		arraytable(a);
	}
}
