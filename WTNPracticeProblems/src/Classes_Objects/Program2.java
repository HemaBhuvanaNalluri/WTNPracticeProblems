package Classes_Objects;
import java.util.*;

class Calculator
{
	static double PowerInt(int num1,int num2)
	{
		return Math.pow(num1,num2);
	}
	static double PowerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}
public class Program2 
{
	public static void main(String args[])
	{
		int num1,num2;
		double num3;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextDouble();
		System.out.println(num1+" power of "+num2+" is "+Calculator.PowerInt(num1, num2));
		System.out.println(num1+" power of "+num3+" is "+Calculator.PowerDouble(num3, num1));
		sc.close();
	}
}
