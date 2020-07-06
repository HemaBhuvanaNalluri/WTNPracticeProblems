package Exception_Handling;
import java.util.*;

@SuppressWarnings("serial")
class InvalidCountryException extends Exception 
{ 
    public InvalidCountryException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
public class Program4 //UserRegistration
{
	public static void registerUser(String username,String userCountry) {
		try {
			if(userCountry.equalsIgnoreCase("India"))
				System.out.println("User Registration Done Successfuly");
			else
				throw new InvalidCountryException("User Outside India cannot be Registered");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) 
	{
		String username,userCountry;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName:");
		username=sc.next();
		System.out.println("Enter UserCountry:");
		userCountry=sc.next();
		sc.close();
		registerUser(username,userCountry);
	}
}
