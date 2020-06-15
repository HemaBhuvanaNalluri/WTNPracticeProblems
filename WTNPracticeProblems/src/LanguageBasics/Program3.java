package LanguageBasics;

public class Program3 
{
	public static void main(String args[])
	{
		int x,y;
		if(args.length==2) {
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			System.out.println("The sum of "+x+" and "+y+" is "+(x+y));
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
