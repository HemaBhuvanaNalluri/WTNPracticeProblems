package Arrays;

public class Program13 {
	public static void main(String[] args){
		if(args.length<4)
		    System.out.println("Please enter 4 integer numbers");
		else{
		    int a[][]=new int[2][2];
		    int i,j,k=0;
		    for(i=0;i<2;i++){
		        for(j=0;j<2;j++){
		            a[i][j]=Integer.parseInt(args[k]);
		            k++;
		        }
		    }
		    for(i=1;i>=0;i--){
		        for(j=1;j>=0;j--){
		            System.out.print(a[i][j]+" ");
		        }
		        System.out.println();
		    }
		}
	}

}
