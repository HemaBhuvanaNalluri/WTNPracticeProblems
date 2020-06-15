package Arrays;

import java.util.*;
public class Program9 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0,i,n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			if(arr[i]!=10)
				System.out.print(arr[i]+" ");
			else
				c++;
		}
		for(i=0;i<c;i++) {
			System.out.print("0 ");
		}
		sc.close();
	}
}
