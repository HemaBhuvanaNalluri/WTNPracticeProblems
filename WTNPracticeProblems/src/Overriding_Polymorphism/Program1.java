package Overriding_Polymorphism;

public class Program1 {
	public static void main(String args[])
	{
		Fruit f=new Fruit();
		f.setName("Mango");
		f.setSize("medium");
		f.setTaste("sweet");
		f.eat();
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
		
		
	}
}
