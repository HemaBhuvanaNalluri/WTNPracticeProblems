package Exception_Handling;

import java.util.*;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception 
{ 
    public InvalidAgeException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
public class Program5 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age;
		String name;
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter age:");
		age=sc.nextInt();
		sc.close();
		try {
			if(!(age>=18&&age<60))
				throw new InvalidAgeException("Age not in range");
			else
				System.out.println("Name of the user:"+name+"  Age of the user:"+age);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
