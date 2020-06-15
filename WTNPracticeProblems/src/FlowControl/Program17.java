package FlowControl;

import java.util.*;
public class Program17 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int rev=0,p=n;
	    while(n!=0){
	        int r=n%10;
	        rev=rev*10+r;
	        n=n/10;
	    }
	    if(p==rev)
	        System.out.println(rev+" is a palindrome");
	    else
	         System.out.println(rev+" is not a palindrome");
	    sc.close();
	}

}
