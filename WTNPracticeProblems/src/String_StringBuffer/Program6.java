package String_StringBuffer;

import java.util.*;
public class Program6 
{
	public static void main(String args[]) {
		String str1,str2,str3="";
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		str2=sc.next();
		sc.close();
		if(str1.length()<str2.length())
			str3=str1+str2+str1;
		else
			str3=str2+str1+str2;
		System.out.println(str3);
	}
}
