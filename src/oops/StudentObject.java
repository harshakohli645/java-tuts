package oops;


class Heart{
	private float weight;
	private int bpm;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getBpm() {
		return bpm;
	}
	public void setBpm(int bpm) {
		this.bpm = bpm;
	}
	public Heart(float weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}
	
}
class Brain{
	private float weight;
	private String colour;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Brain(float weight, String colour) {
		super();
		this.weight = weight;
		this.colour = colour;
	}
}
class Bike{
	private String brand;
	private float mileage;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	public Bike(String brand, float mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}
}
class Book{
	private String name;
	private String author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
}
class Student{
	Heart h=new Heart(289.3f,72);
	Brain b=new Brain (273.3f,"grey");
	public  void hasA(Book h)
	{
		System.out.println(h.getName());
		System.out.println(h.getAuthor());
	}
	public void hasA(Bike m) {
		System.out.println(m.getBrand());
		System.out.println(m.getMileage());
	}
}

public class StudentObject {
	public static void main(String[] args) {
		Student s = new Student();
        Book b= new Book("java","james");	
        Bike bi=new Bike("duke",34.3f);
        System.out.println(s.h.getBpm());
        System.out.println(s.b.getWeight());
        System.out.println(s.h.getWeight());
        System.out.println(s.b.getColour());
        s.hasA(bi);
        s.hasA(b);
        
        
    }
}
