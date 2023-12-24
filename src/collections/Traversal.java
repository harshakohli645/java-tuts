package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Traversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList ar = new ArrayList();
		ar.add("harsha");
		ar.add(738);
		ar.add(true);
		ar.add(null);
	    ListIterator li = ar.listIterator();
	    while(li.hasNext())
	    {
	    	System.out.print(li.next()+" ");
	    }
	    System.out.println();
	    while(li.hasPrevious())
	    {
	    	System.out.print(li.previous()+" ");
	    }
	    System.out.println();
	    for(Object  a:ar)
	    {
	    	System.out.print(a+" ");
	    	
	    }
	    System.out.println();
	    Vector a=new Vector();
	    a.add("harsha");
	    a.add(true);
	    a.add(557);
	    a.add(45.4f);
	    Enumeration el = a.elements();
	    while(el.hasMoreElements())
	    {
	    	System.out.print(el.nextElement()+" ");
	    }
	    System.out.println();
	    for(Object j:a)
	    {
	    	System.out.print(j+" ");
	    }System.out.println();
		
	    System.out.println(ar.hashCode());
	}

}
