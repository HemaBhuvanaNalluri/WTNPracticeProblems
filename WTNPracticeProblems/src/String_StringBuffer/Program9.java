package String_StringBuffer;

import java.util.*;

public class Program9 
{
	public static void main(String args[])
	{
		String str1,str2,str3="";
		int n,i;
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		str2=sc.next();
		sc.close();
		if(str1.length()<=str2.length()) 
		{
			n=str1.length();
			for(i=0;i<n;i++) 
			{
				str3=str3+str1.charAt(i)+str2.charAt(i);
			}
			if(i<str2.length())
				str3=str3+str2.substring(i,str2.length());
		}
		else 
		{
			n=str2.length();
			for(i=0;i<n;i++) 
			{
				str3=str3+str1.charAt(i)+str2.charAt(i);
			}
			str3=str3+str1.substring(i,str1.length());
		}
		System.out.println(str3);
	}
}
