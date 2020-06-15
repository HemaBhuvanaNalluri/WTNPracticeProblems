package Arrays;

import java.util.*;
public class Program2 {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int max,min,i;
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    max=min=a[0];
	    for(i=0;i<n;i++)
	    {
	        if(a[i]<min)
	            min=a[i];
	        if(a[i]>max)
	            max=a[i];
	    }
	    System.out.println("Min:"+min);
	    System.out.println("Max:"+max);
	    sc.close();
	}

}
