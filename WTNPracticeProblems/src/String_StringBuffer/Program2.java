package String_StringBuffer;

import java.util.*;
public class Program2 
{
	public static void main(String args[])
	{
		String str1,str2,str3="";
		Scanner sc=new Scanner(System.in);
		str1=sc.next().toLowerCase();
		str2=sc.next().toLowerCase();
		sc.close();
		if(str1.charAt(str1.length()-1)==str2.charAt(0))
			str3=(str1.substring(0, str1.length()-1)+str2);
		else
			str3=(str1+" "+str2);
		
		System.out.println(str3);
	}
}
