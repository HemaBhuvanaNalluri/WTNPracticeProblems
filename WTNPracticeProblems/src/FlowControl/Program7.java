package FlowControl;

import java.util.*;


public class Program7 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
	    char a1=sc.next().charAt(0);
	    sc.close();
	    if(Character.isLowerCase(a1))
	        System.out.println(Character.toUpperCase(a1));
	   else
	        System.out.println(Character.toLowerCase(a1));	    
	}
}
