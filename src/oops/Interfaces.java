package oops;

import java.util.Scanner;

interface  Calculater
{
	public void add();
	public void sub();
	public void div();
}
interface Calc extends Calculater
{
	
}
class Mycal implements  Calculater
{
	int a=500;
	int b=400;
	
	public void add()
	{
		System.out.println(a+b);
	}
	public void sub()
	{		
		System.out.println(a-b);
	}
	public void div()
	{
		System.out.println(a/b);
	}
}
class Mycal2 implements Calculater
{
	Scanner s=new Scanner(System.in);
	public void add()
	{
		int a=s.nextInt();		
		int b=s.nextInt();	
		System.out.println(a+b);
		
	}
	public void sub() {
		int a=s.nextInt();		
		int b=s.nextInt();	
		System.out.println(a-b);
		
	}
		
	public void div()
	{
		int a=s.nextInt();		
		int b=s.nextInt();	
		System.out.println(a/b);
		
	}
}
class Mycal3 implements Calculater
{
	Scanner s=new Scanner(System.in);
	public void add()
	{
		int a=s.nextInt();		
		int b=s.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("invalid input");
		}
		else
		{
					
			System.out.println(a+b);
		}
		
	}
	public void sub() {
		int a=s.nextInt();		
		int b=s.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("invalid input");
		}
		else
		{
			
			System.out.println(a-b);
		}
		
	}
	
	public void div()
	{
		int a=s.nextInt();		
		int b=s.nextInt();
		if(a==0 || b==0)
		{
			System.out.println("invalid input");
		}
		else
		{
		  System.out.println(a/b);
		}
		
	}
	
}
class Math
{
	public void Cals( Calculater ref)
	{
		ref.add();
		ref.sub();
		ref.div();
	}
}

public class Interfaces {
		public static void main(String[] args) {
			Mycal mc = new Mycal();
			Mycal2 mc2 = new Mycal2();
			Mycal3 mc3 = new Mycal3();
			Math m = new Math();
			
			m.Cals(mc);
			m.Cals(mc2);
			m.Cals(mc3);
		}
		
}
