package collections;

import java.util.ArrayList;
import java.util.Scanner;

class Homo
{
	
	public void fun1(ArrayList a)
	{
		ArrayList t=new ArrayList(a);
		
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.remove(0);
		System.out.println(t);
		
		
		
	}
}


public class Arrays {
	public static void main(String[] args) {
		
		ArrayList<String> t1=new ArrayList<String>(11);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<11;i++)
		{
		    String  s=sc.nextLine();
		    t1.add(s);
		}
		t1.add(0, null);
		t1.set(0, "anu");
		for(String n:t1)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		Homo h = new Homo();
		
		h.fun1(t1);
	}
}
	   
