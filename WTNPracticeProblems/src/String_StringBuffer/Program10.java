package String_StringBuffer;

import java.util.*;
public class Program10 
{
	public static void main(String args[]) 
	{
		String str,substr,res="";
		int n;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		n=sc.nextInt();
		sc.close();
		substr=str.substring(str.length()-n, str.length());
		for(int i=0;i<n;i++) {
			res=res+substr;
		}
		System.out.println(res);	
	}
}
