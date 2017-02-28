package simpleApp;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
	        System.out.println("Enter an operation without spaces you wish to perform : ");
	        String a = input.nextLine();
	        Operation op = new Operation();
	        a = op.brackets(a);
	        System.out.println("Result: "+a);
	
	}

}
