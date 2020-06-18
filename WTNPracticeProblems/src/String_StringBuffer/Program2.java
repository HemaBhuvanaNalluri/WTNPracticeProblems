package String_StringBuffer;

import java.util.*;
public class Program2 
{
	public static void main(String args[])
	{
		String str1,str2,str3="";
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		str2=sc.next();
		sc.close();
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
			str3=(str1.substring(0, str1.length()-1)+str2).toLowerCase();
		else
			str3=(str1+" "+str2).toLowerCase();
		
		System.out.println(str3);
	}
}
