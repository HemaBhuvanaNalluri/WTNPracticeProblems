package FlowControl;

import java.util.Scanner;
public class Program8 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a color code:");
	    char a1=sc.next().charAt(0);
	    sc.close();
	    switch(a1){
	        case 'R':
	            System.out.println("Red");
	            break;
	        case 'B':
	            System.out.println("Blue");
	            break;
	        case 'G':
	            System.out.println("Green");
	            break;
	        case 'O':
	            System.out.println("Orange");
	            break;
	        case 'Y':
	            System.out.println("Yellow");
	            break;
	        case 'W':
	            System.out.println("White");
	            break;
	        default:
	            System.out.println("Invalid Code");
	            break;
	    }
	}

}
