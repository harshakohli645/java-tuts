package arrays;

import java.util.ArrayList;

public class OddEven {
	public static void main(String[] args) {
		ArrayList<Integer>oddeven=new ArrayList<Integer>();
		
	int a[]= {12,34,45,9,8,90,3,1,7,6};
	int small=a[0];
	int second=a[0];
	for(int i=0;i<a.length-1;i++)
	{
		if(small>a[i+1])
		{
			second=small;
			small=a[i+1];
			
		}
	}
	System.out.println(second);
	int  b=a[a.length-1];
      
		for(int i=0;i<a.length-1;i++)
		{ 
			if(a[i]%2==0)
			{
				oddeven.add(a[i]);
			}
		}
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==1)
			{
				oddeven.add(a[i]);
			}
		}
		oddeven.add(b);
		System.out.println(oddeven);
	}

}
