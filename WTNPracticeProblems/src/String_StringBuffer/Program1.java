package String_StringBuffer;
import java.util.*;
public class Program1 {
	public static void main(String args[]) {
		int i,c=0;
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a string:");
		str=sc.next();
		sc.close();
		for(i=0;i<str.length()/2;i++) 
		{
			if(str.charAt(i)==str.charAt(str.length()-i-1))
				c++;
			else
				break;
		}
		if(c==(str.length()/2))
			System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is not a palindrome");
	}
}
