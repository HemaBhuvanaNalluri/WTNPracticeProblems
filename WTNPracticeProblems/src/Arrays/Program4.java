package Arrays;

import java.util.*;

public class Program4 {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int i;
	    int n=sc.nextInt();
	    //double avg;
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++){
	            String str=Character.toString((char) a[i]);
	            System.out.print(str+" ");
	     }
	    sc.close();
	}

}
