package Exception_Handling;

public class Program2 
{
	public static void main(String args[])throws Exception 
	{
		int sum=0;
		double avg=0.0;
		int arr[]=new int[5];
		arr[0]=Integer.parseInt(args[0]);
		arr[1]=Integer.parseInt(args[1]);
		arr[2]=Integer.parseInt(args[2]);
		arr[3]=Integer.parseInt(args[3]);
		arr[4]=Integer.parseInt(args[4]);
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		System.out.println("sum :"+sum);
		System.out.println("Average :"+avg);
	}
}
