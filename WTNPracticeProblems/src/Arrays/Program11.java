package Arrays;

import java.util.*;
public class Program11 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f=0,t=0,i,n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==1 ||arr[i]==4)
				t++;
			else 
				f++;
		}
		if(f==0||t==n)
			System.out.println("true");
		else
			System.out.println("false");
		sc.close();
	}
}
