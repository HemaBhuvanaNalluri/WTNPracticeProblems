package String_StringBuffer;

import java.util.*;
public class Program8 {
	public static void main(String args[])
	{
		String str,substr;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		sc.close();
		int index=str.indexOf('*');
		substr=str.substring(index-1, index+2);
		str=str.replace(substr, "");
		System.out.println(str);
	}
}
