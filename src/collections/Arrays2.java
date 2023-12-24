package collections;

import java.util.ArrayList;
import java.util.Vector;

public class Arrays2 {
	public static void main(String[] args) {
		Vector v = new Vector(20,10);
		v.add(10);
		v.add(24);
		v.add(57);
		v.add(78);
		v.add("harsha");
		v.add(3.5f);
		v.add(true);
		System.out.println(v);
		System.out.println(v.size());
		v.add(90);
		v.add(70);
		v.add("sivajai");
		v.add("siva");
		v.add("sai");
		v.add("kohli");
		System.out.println(v.size());
		
		System.out.println(v);
		ArrayList a=new ArrayList(v);
		System.out.println(a.isEmpty());
		System.out.println(a);
	}

}
