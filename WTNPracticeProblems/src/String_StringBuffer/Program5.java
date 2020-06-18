package String_StringBuffer;

import java.util.*;
public class Program5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str,res;
		str=sc.next();
		sc.close();
		res=str.substring(1, str.length()-1);
		System.out.println(res);
	}
}
