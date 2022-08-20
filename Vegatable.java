package this_constructor;

public class Vegatable {
	int price;
	double weight;
	String name;
	int number;
	Vegatable(String name,double weight,int price,int number)
	{
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.number=number;
	}
      public  void displayvegatable()
   {
	System.out.println(this.name);
	System.out.println(this.weight);
	System.out.println(this.price);
	System.out.println(this.number);
	System.out.println("==============");
}

}



