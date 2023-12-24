package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;


public class Arrays7 {
	public static void main(String[] args) {
		//LinkedHashMap<String,Integer> set = new LinkedHashMap<String,Integer>();
		TreeMap<String,Integer> set=new TreeMap<String,Integer>();
		set.put("harsah", 9);
		set.put("hareesh", 6);
		set.put("eswar", 8);
		set.put("yaswanth", 7);
		set.put("sivaji",10);
		set.put("viart", 6);
		
		
		
		Set<String> k1 = set.keySet();
		for(String l:k1) {
			System.out.println(l+" "+set.get(l));
		}
	}

}
