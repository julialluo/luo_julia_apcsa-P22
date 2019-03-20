//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		String n = keyboard.next();
		System.out.print("Enter 1st monster's size: ");
		int s = keyboard.nextInt();
		
		System.out.print("Enter 2nd monster's name : ");
		String na = keyboard.next();
		System.out.print("Enter 2nd monster's size: ");
		int si = keyboard.nextInt();
		//instantiate monster one
		Skeleton test = new Skeleton (n,s);
		
		Skeleton tes = new Skeleton (na,si);
		//ask for name and size
		System.out.println("Monster 1 - " + test);
		System.out.println("Monster 2 - " + tes);
		//instantiate monster two
		if (test.isBigger(tes)) {
			System.out.println("Monster one is smaller than Monster two");
		}
		if (test.isSmaller(tes)) {
			System.out.println("Monster one is bigger than Monster two");
		}
		
		
		
		
	}
}