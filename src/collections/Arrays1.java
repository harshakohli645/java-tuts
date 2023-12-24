package collections;

import java.util.LinkedList;

public class Arrays1 {
	public static void main(String[] args) {
		LinkedList t=new LinkedList();
		t.add(517);
		t.add(557);
		t.add(579);
		System.out.println(t);
		t.addFirst(511);
		System.out.println(t);
		t.add(1, 512);
		System.out.println(t);
		t.removeFirst();
		System.out.println(t);
		System.out.println(t.get(3));
		t.add("harsha");
		t.add("sivaji");
		t.add(true);
		t.add(null);
		Demo d = new Demo();
		d.fun2(t);
		
	}

}
class Demo
{
	public void fun2(LinkedList s)
	{
		LinkedList t=new LinkedList(s);
		t.add(5.76);
		t.addFirst(1.0);
		t.addLast(0.9);
		for(int i=0;i<t.size();i++)
		{
			System.out.println(t.get(i));
		}
		System.out.println(t.containsAll(s));
		System.out.println(t.size());
		t.remove(0);
		System.out.println(t.contains(557));
		System.out.println(t.size());
		t.clear();
		System.out.println(t);
		System.out.println(t.isEmpty());
	}
}
