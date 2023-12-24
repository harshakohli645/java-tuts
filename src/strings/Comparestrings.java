package strings;

import java.util.Scanner;

 public class Comparestrings 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Dog a=new Dog();
		//a.barking();
		//System.out.println(a.color);
		//System.out.println(a.name);
		int n=sc.nextInt();
		int m=sc.nextInt();
		oddnumbers(n,m);
		
	 }
	static void oddnumbers(int n,int m)
	{
		for(int i=n;i>=m;i--)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}

}

 class Dog
{
	public String name="banti";
	 public int cost=5000;
	public String color="black";
	  void barking()
	  {
		  System.out.println("dog is barking");
	  }
	 
   
}
