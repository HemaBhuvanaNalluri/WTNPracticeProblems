package FlowControl;

import java.util.*;

public class Program1A 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		if(x>0) 
			System.out.println("Positive Number");
		else if(x<0)
			System.out.println("Negative Number");
		else
			System.out.println("Zero");
		sc.close();
	}
}
