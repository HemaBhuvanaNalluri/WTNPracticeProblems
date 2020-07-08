package Wrapper_Classes;

import java.util.*;

public class Program3 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n>=1&&n<=255)
		{
			int binarynum=Integer.parseInt(Integer.toBinaryString(n));
			System.out.println(String.format("%08d", binarynum));
		}
		else {
			System.out.println("Invalid Range");
		}
	}
}
