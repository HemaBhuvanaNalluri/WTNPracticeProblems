package Arrays;

import java.util.*;
public class Program3 {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int key,i;
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    key=sc.nextInt();
	    for(i=0;i<n;i++){
	        if(a[i]==key){
	            System.out.println(i+1);
	            break;
	        }
	    }
	    if(i==n){
	        System.out.println("-1");
	    }
	    sc.close();
	}

}
