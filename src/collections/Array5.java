package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
class Compare implements Comparator<Integer>{
	public int compare(Integer a,Integer b){
		return b-a;
	}
	
}

public class Array5 {
	public static void main(int[] args) {
		Compare b = new Compare();
		PriorityQueue<Integer>a = new PriorityQueue<Integer>(b);
		//LinkedBlockingQueue<Integer> a = new LinkedBlockingQueue<Integer>();
		a.add(60);
		a.add(10);
		a.add(30);
		a.add(20);
		a.add(50);
		a.add(40);
		for(int c:a) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
	}

}
