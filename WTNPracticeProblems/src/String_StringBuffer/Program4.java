package String_StringBuffer;

import java.util.*;
public class Program4 {
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		sc.close();
		if(str.length()%2==0) {
			System.out.println(str.substring(0,str.length()/2));
		}
		else {
			System.out.println("null");
		}
	}
}
