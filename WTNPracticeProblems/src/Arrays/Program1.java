package Arrays;

import java.util.*;
public class Program1 {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int sum=0,i;
	    int n=sc.nextInt();
	    double avg;
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	        sum=sum+a[i];
	    }
	    avg=sum/n;
	    System.out.println("Sum:"+sum);
	    System.out.println("Avg:"+avg);
	    sc.close();
	}

}
