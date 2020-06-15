package Arrays;

import java.util.*;
public class Program7 {
	public static void main(String[] args){
		int[] arr_elements = new int[20];
		int i;
		Scanner sc = new Scanner(System.in);
		int arr_size = sc.nextInt();
		for(i=0;i<arr_size;++i)
		{
			arr_elements[i] = sc.nextInt();
		}
        for(i=0;i<arr_size;i++)
		{
		    for(int j=i+1;j<arr_size;){
		        if(arr_elements[i]==arr_elements[j]){
		            for(int t=j;t<arr_size;t++){
		                arr_elements[t]=arr_elements[t+1];
		            }
		            arr_size=arr_size-1;
		        }
		        else
		            j++;
		    }
		}
		for(i=0;i<arr_size;++i)
			System.out.println(arr_elements[i]);
		sc.close();
	}

}
