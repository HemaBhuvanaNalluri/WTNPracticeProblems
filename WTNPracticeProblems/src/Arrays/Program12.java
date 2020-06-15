package Arrays;

import java.util.*;
public class Program12 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		int arr3[]=new int[2];
		for(i=0;i<3;i++) {
			arr1[i]=sc.nextInt();
		}
		for(i=0;i<3;i++) {
			arr2[i]=sc.nextInt();
		}
		arr3[0]=arr1[1];
		arr3[1]=arr2[1];
		for(i=0;i<2;i++) {
			System.out.print(arr3[i]+" ");
		}
		sc.close();
	}
}
