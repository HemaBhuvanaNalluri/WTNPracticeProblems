package FlowControl;

import java.util.Scanner;

public class Program5 {
	public static void main(String args[])
	{
		char input_char;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		input_char=sc.next().charAt(0);
		sc.close();
		if ((input_char >= 65 && input_char <= 90) || (input_char >= 97 && input_char <= 122)) 
			System.out.println("Alphabet "); 
	    else if (input_char >= 48 && input_char <= 57) 
	    	System.out.println("Digit "); 
	    else
	        System.out.println("Special Character "); 
	}
}
