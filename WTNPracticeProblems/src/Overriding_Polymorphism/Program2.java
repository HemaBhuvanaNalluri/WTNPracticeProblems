package Overriding_Polymorphism;

public class Program2 
{
	public static void main(String args[])
	{
		Shape c=new Circle();
		c.draw();
		c.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		Shape s=new Square();
		s.draw();
		s.erase();
	}
}
