package FlowControl;

import java.util.*;
public class Program1B 
{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two digits:");
		x=sc.nextInt();
		y=sc.nextInt();
		sc.close();
		if(x%10==y%10) {
			System.out.println("Last Digits are equal");
		}
		else {
			System.out.println("Last Digits are not equal");
		}
	}
}
