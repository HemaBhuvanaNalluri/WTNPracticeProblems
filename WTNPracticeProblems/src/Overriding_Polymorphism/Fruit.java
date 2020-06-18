package Overriding_Polymorphism;

public class Fruit 
{
	private String name,taste,size;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void eat()
	{
		System.out.println("Name of the Fruit is:"+getName());
		System.out.println("Taste of the Fruit is:"+getTaste());
	}
}
