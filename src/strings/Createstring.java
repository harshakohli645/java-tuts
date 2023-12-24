package strings;

public class Createstring 
{
	public static void main(String[]args)
	{
		//three ways to create strings
		String s = new String("HARSHA");
		String s1="harsha";
		char n[]={'h','a','r','s','h','a'};
		String m=new String(n);
		String h=new String("harsha");
		if(s1.equalsIgnoreCase(s))
		{
			System.out.println("values are equls ");
		}
		else
		{
		    System.out.print("values are uneqal");
		}
		//System.out.print(m);
	}
}
