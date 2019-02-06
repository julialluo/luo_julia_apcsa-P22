//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a whole number :: ");
		int amt = keyboard.nextInt();
		System.out.println(amt + " is odd :: " + NumberVerify.isOdd(amt));
		System.out.println(amt + " is even :: " + NumberVerify.isEven(amt));
		
		
		
		//add in more test cases
	}
}