package oops;


class Plane
{
	void takeOff()
	{
		System.out.print("plane is takingoff");
	}
	void fly()
	{
		System.out.println("plane is flyig");
	}
	void land() 
	{
		System.out.println("palne is landing ");
	}
	
	
}
class CargoPlane extends Plane{
	void takeOff()
	{
		System.out.println("carago plane is takingoff long run way");
	}
	void fly() {
		System.out.println("cargo plane flying at low meadim");
	}
	void land()
	{
		System.out.println("cargo planne is landing run ways");
	}
}
class PassengerPlane extends Plane
{
	void takeOff()
	{
		System.out.println("passener plane is takingoff median run way");
	}
	void fly() {
		System.out.println("passener plane flying at meadim");
	}
	void land()
	{
		System.out.println("passener planne is landing run ways");
	}
	void CarryPass()
	{
		System.out.println("carry passengr");
	}
}
class FighterPlane extends Plane
{
	void takeOff()
	{
		System.out.println("fighter plane is takingoff short run way");
	}
	void fly() {
		System.out.println("fighter plane flying at high meadim");
	}
	void land()
	{
		System.out.println("fighter planne is landing run ways");
	}
}
class Airpot
{
	public void permit(Plane ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
		
	}
}





public class Inheritance3 {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airpot a = new Airpot();
		
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		Plane red;
		red=pp;
		((PassengerPlane)(red)).CarryPass();
		Customer c = new Customer();
		System.out.println(c.getcId());
		
	}
	
	
}
