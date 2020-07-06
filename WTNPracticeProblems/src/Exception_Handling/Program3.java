package Exception_Handling;
import java.util.*;

@SuppressWarnings("serial")
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
public class Program3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String student[]=new String[2];
		int marks[]=new int[3];
		int sum;
		try {
			for(int j=0;j<2;j++) {
				sum=0;
				System.out.println("Enter the name of "+(j+1)+" student:");
				student[j]=sc.next();
				System.out.println("Enter the 3 subject marks of the student:" );
				for(int i=0;i<3;i++) {
					marks[i]=sc.nextInt();
					sc.close();	
					if(marks[i]<0||marks[i]>100)
						throw new MyException("U entered marks out of the range");
					sum+=marks[i];
				}
				double avg=sum/3.0;
				System.out.println("avg of "+(j+1)+" student:"+avg);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
