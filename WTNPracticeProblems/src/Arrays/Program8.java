package Arrays;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args){
		int[] a = new int[20];
		int i,sum=0;
		Scanner sc = new Scanner(System.in);
		int arr_size = sc.nextInt();
		for(i=0;i<arr_size;++i)
		{
			a[i] = sc.nextInt();
		}
        for(i=0;i<arr_size;i++)
		{
		    if(a[i]!=6)
		    {
		        sum=sum+a[i];
		    }
		    else{
		        if(i!=arr_size-1){
		        while(a[i]!=7){
		            i++;
		        }
		        }
		        else{
		            sum=sum+a[i];
		        }
		    }
		}
			System.out.println(sum);
			sc.close();
	}

}
