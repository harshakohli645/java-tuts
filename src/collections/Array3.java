package collections;

import java.util.Stack;

public class Array3 {
	public static void main(String[] args) {
		Stack st = new Stack();
	    
		st.push("harsha");
		st.push("virat");
		st.push(57);
		st.push(25.3f);
		
		System.out.println(st);
		//System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.search("harsha"));
		System.out.println(st.search(57));
		for(Object a: st) {
			System.out.println(a+" ");
			
		}
		System.out.println(st.search(25.3f));
		
		System.out.println(st.indexOf(25.3f));
	}

}
