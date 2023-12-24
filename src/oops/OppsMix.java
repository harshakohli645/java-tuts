package oops;

import java.util.Scanner;

abstract class Car
{
	String name;
	double mileage;
	public abstract void CarName();
	public abstract void CarMileage();
	public void display() {
		System.out.println(name);
		System.out.println(mileage);
	}
}
class RangeRover extends Car{

	Scanner sc = new Scanner(System.in);
	public void CarName() {
		System.out.println("enter car barnd");
		name = sc.next();
	}

	public void CarMileage() {
		System.out.println("enter milege");
		 mileage = sc.nextDouble();
	}
	
}
class Bmw extends Car{
	Scanner sc = new Scanner(System.in);
	
	public void CarName()
	{
		System.out.println("enter car barnd");
		name =sc.next();
	}
	public void CarMileage(){
		System.out.println("enter milege");
		mileage=sc.nextDouble();
	}
}
class Allow
{
	void permission(Car ref)
	{
		ref.CarName();
		ref.CarMileage();
		ref.display();
	}
}

public class OppsMix {
	public static void main(String[] args) {
		RangeRover r = new RangeRover();
		Bmw b = new Bmw();
		Allow a = new Allow();
		a.permission(r);
		a.permission(b);
		
	}
}
