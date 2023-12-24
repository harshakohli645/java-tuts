package collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
class Cars  implements Comparable<Cars>{
	int num;
	String Brand;
	int cost;
	Cars(int num,String Brand,int cost)
	{
		this.num=num;
		this.Brand=Brand;
		this.cost=cost;
		
	}
	public String toString() {
		return num+" "+Brand+" "+cost;
	}
	@Override
	public int compareTo(Cars c2) {
		Cars c1 = this;
		String name=c1.Brand;
		String name1=c2.Brand; 
		if(name.length()==name1.length())
		{
			if(name.compareTo(name1)==0)
			{
				if(c1.cost==0&& c2.cost==0)
				{
					if(c1.num==0&& c2.num==0)
					{
						
					}
					else
					{
						return c1.num-c2.num;
					}
				}
				else
				{
					return c1.cost-c2.cost;
				}
			}
			else
			{
				return name.compareTo(name1);
			}
			
		}
		else
		{
			return name1.length()-name.length();			
		}
		return -1;
				
	}
	
}

public class Arrays4 {
	public static void main(String[] args) {
		//HashSet<Cars>  set = new HashSet<Cars>();
		//LinkedHashSet<Cars> set=new LinkedHashSet<Cars>();
		TreeSet<Cars> set=new TreeSet<Cars>();
		/*set.add("harsrha");
		set.add(6);
		set.add(67.3f);
		set.add(true);
		set.add(null);
		set.add(null);
		set.add(67.3f);*/
		set.add (new Cars(7,"bmw",2900));
		set.add (new Cars(6,"Mg",1100));
		set.add (new Cars(8,"RangeRover",20000));
		set.add (new Cars(8,"RangeRover",20000));
		set.add (new Cars(8,"RangeRover",20000));
		set.add (new Cars(9,"Hundayi",2900));
		set.add (new Cars(7,"awm",2900));
		set.add (new Cars(7,"sujiki",2900));
		set.add (new Cars(1,"awm",200));
		set.add (new Cars(5,"Skoda",21092));
		
		for(Cars a:set) {
		System.out.println(a);
		
		}
		
	}

}
