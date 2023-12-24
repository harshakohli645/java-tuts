package basicprograms;

import java.util.Scanner;

class Demo
{
	void fun1()throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("conn 2 is estad");
		try {
			System.out.println("enter the number");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception is handled in fun()");
			throw e;
		}
		
		finally {
		  System.out.println("conn 2 is terminated");
		}
		
	}
}
class Demo1{
	Demo df  =new Demo();
	  void fun2(Exception e) 
	  {
		  try {
			  df.fun1();
		  }
		  catch(Exception f) {
			  System.out.println("exception handled fun2");
		  }
	  }
		 
	   
}

public class DifferentWayExcepiton {
	  public static void main(String[] args) {
		  System.out.println("conn 1 is etsd");
		Demo _d = new Demo();
		Demo1 d1 = new Demo1();
		try {
			_d.fun1();
		} catch (Exception e) {
			System.out.println("exception handled in main");
			d1.fun2(e);
		}
		finally {
		System.out.println("conn 2 is terminated");
		}
		
	}

}
