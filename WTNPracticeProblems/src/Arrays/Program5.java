package Arrays;

import java.util.*;
public class Program5 {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int i;
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a); 
	    System.out.println("2 largest are "+a[n-2]+" "+a[n-1]);
	    System.out.println("2 smallest are "+a[0]+" "+a[1]);
	    sc.close();
	}

}
