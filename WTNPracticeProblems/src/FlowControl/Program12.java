package FlowControl;

import java.util.*;
public class Program12 {
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int c=0,i;
	    for(i=1;i<=n;i++){
	        if(n%i==0)
	            c++;
	    }
	    if(c==2)
	        System.out.print(n+" is prime\n");
	    
	    else
	    	System.out.print(n+" is not a prime\n");
	    
	    sc.close();
	}
}
