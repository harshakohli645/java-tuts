package strings;

public class Sub 
{
	public static void main(String[] args) {
		String s=" harsha kohli sandhya";
		System.out.println(s.substring(3,5));
		System.out.println(s.startsWith("ha"));
		System.out.println(s.endsWith("ha"));
		System.out.println(s.contains("rm"));
		System.out.println(s.replace('r','s'));
		System.out.println(s.split("ha"));
		System.out.println(s.trim());
		String[] result=s.split(" ",4);
		for(String str:result)
		{
			System.out.print(str +",");
		}
		String m=String.format("%d", 100);
		System.out.println(m);
		//System.out.format("%.4f",m);
		double a=12.0;
		System.out.format("%.4f",a);
		
		
	}
}
