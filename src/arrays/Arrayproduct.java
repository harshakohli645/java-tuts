package arrays;
import java.util.*;
public class Arrayproduct 
{
	static int[] product(int[]m)
	{
		int ar[]=new int[m.length];
		for(int i=0;i<m.length;i++)
		{ 
			int p=1;  
			for(int j=0;j<m.length;j++)
			{
				if(m[i]!=m[j])
				{
					p=p*m[j];
					
				}
			}
			ar[i]=p;
		}
	    return ar;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{                                              //objects have defalut hash vaues
			a[i]=sc.nextInt();
		}
		int[]res=product(a);
		for(int j=0;j<res.length;j++)
		{
			System.out.print(res[j]+" ");
		}
	}
}
