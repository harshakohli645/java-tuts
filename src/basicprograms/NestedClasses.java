package basicprograms;

import basicprograms.Addtion.Sub;

class Addtion
{
	int x=9;
	class Sub{
		int y=10;
		public void display()
		{
			System.out.println(x);
			System.out.println(y-x);
			System.out.println(y+x);
		}
	}
}


class NestedClasses {
	public static void main(String[] args) {
		Addtion add = new Addtion();
		
		Addtion.Sub s = add.new Sub();
		System.out.println(s.y+" "+add.x);
		s.display();
	}
}
