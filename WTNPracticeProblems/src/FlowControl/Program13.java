package FlowControl;

public class Program13 {
	public static void main(String[] args) {
	    int c,i;
	    for(int j=10;j<=99;j++)
	    {
	        c=0;
	        for(i=2;i<j;i++)
	        {
	        	if(j%i==0)
	        		c++;
	        }
	        if(c==0)
	        	System.out.print(j+"\n");
	    }
	}

}
