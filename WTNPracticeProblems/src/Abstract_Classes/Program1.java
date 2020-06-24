package Abstract_Classes;
import java.util.Random; 

abstract class Compartment{
	public abstract String notice();
}

class FirstClass extends Compartment{
	public String notice() {
		return "First Class Compartment";
	}
}

class Ladies extends Compartment{
	public String notice() {
		return "Ladies Compartment";
	}
}

class General extends Compartment{
	public String notice() {
		return "General Compartment";
	}
}

class Luggage extends Compartment{
	public String notice() {
		return "Luggage Compartment";
	}
}
public class Program1//TestCompartment
{
	public static void main(String args[]) 
	{
		int i;
		Compartment arr[]=new Compartment[10];
		Random random = new Random();
		for(i=0;i<10;i++) {
			int j=random.nextInt(4 - 1) + 1;
			if(j==1)
				arr[i]=new Luggage();
			if(j==2)
				arr[i]=new Ladies();
			if(j==3)
				arr[i]=new General();
			if(j==4)
				arr[i]=new FirstClass();
			
			System.out.println(arr[i].notice());
				
		}
	}
}
