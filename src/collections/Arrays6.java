package collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Com implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) 
	{
		return o2-o1;
	}
	
}
public class Arrays6 
{
	public static void main(String[] args) 
	{
	Com c = new Com();
	TreeSet<Integer>h= new TreeSet<Integer>(c);
	
	h.add(67);
	h.add(90);
	h.add(3);
	h.add(77);
	h.add(37);
	h.add(6);
	System.out.println(h);

	
	}
	

}


