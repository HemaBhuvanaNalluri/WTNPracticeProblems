package String_StringBuffer;

import java.util.*;
public class Program3 
{
	public static void main(String args[])
	{
		String str,res="";
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		sc.close();
		for(int i=0;i<str.length();i++) {
			res=res+str.substring(0,2);
		}
		System.out.println(res);
	}
}
