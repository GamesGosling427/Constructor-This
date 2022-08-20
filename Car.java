package this_constructor;

public class Car {
	String name;
	int price;
	String color;
	public Car(String name,int price,String color)
	{
		this.name=name;
		this.price= price;
		this.color=color;
	}
	public void displaycar()
	{
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.color);
	    System.out.println("======================");
	}
 }
