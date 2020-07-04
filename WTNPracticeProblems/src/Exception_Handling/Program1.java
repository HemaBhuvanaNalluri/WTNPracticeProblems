package Exception_Handling;

import java.util.*;
public class Program1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try 
		{
			System.out.println("Enter the size of the array:");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the elements of the array:");
			for(int i=0;i<n;i++){
				String str=sc.next();
				arr[i]=Integer.parseInt(str);
			}	
			System.out.println("Enter the index to be accessed:");
			int index=sc.nextInt();
			System.out.println("The array element at "+index+" is "+arr[index]);
			System.out.println("The array element successfully accessed");
			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
	}
}
