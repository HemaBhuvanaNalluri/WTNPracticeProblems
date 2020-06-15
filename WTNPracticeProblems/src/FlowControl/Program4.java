package FlowControl;

import java.util.*;
public class Program4 
{
	public static void main(String args[])
	{
		char a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two characters:");
		a=sc.next().charAt(0);
		b=sc.next().charAt(0);
		sc.close();
		int x=Character.compare(a,b);
		if(x==0)
			System.out.println(a+", "+b);
		else if(x>0)
			System.out.println(b+", "+a);
		else
			System.out.println(a+", "+b);
		
	}
}
