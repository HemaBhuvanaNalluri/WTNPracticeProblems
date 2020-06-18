package String_StringBuffer;

import java.util.*;
public class Program7 
{
	public static void main(String args[])
	{
		String str,res="";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		sc.close();
		if(str.charAt(0)=='x'&& str.charAt(str.length()-1)=='x')
			res=str.substring(1, str.length()-1);
		else
			res=str;
		System.out.println(res);
	}
}
