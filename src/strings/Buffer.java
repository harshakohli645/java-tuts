package strings;

public class Buffer 
{
	public static void main(String[] args) {
		StringBuffer sc = new StringBuffer();
		sc.append("harsha");
		System.out.println(sc.capacity());
		System.out.println(sc);
		sc.trimToSize();
		System.out.println(sc.capacity());
		sc.append(" Bhojanapu");
		System.out.println(sc);
		System.out.println(sc.capacity());
	}
}
