package FlowControl;

import java.util.*;
public class Program14 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum;
	    for(sum=0;n>0;sum+=n%10,n/=10);
	    System.out.println(sum);
	    sc.close();
	}

}
