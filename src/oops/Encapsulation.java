package oops;
class coustomer
{
	private int Id;
	String Name;
	int Number;
	public void setId(int Id,String Name,int Number)
	{
		this.Id=Id;
		this.Name=Name;    //jvm will dentifiying nstanceii varible by using (this)key word
		this.Number=Number;
	}
	public int getId()			//shawdowing prolem will ocuurecs we achive this key word
	{
		return Id;
	}
	public String getName()
	{
		return Name;
	}
	public int getNumber()
	{
		return Number;
	}
}



public class Encapsulation 
{
	public static void main(String[] args) 
	{
		coustomer b = new coustomer();
		//b.setId(557,"hareesh",9351767);
		b.setId(579,"yasma",93516767);
		
		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getNumber());


	}
	
}
