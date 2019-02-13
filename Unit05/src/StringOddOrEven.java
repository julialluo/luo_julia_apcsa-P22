//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		int sLength = word.length();
		if (sLength%2==0)
		{
 		return false;
		}
		return true;
	}

 	public String toString()
 	{
 		
 		if (isEven()) {
			String output = (word + " is odd");
			return output;
		}
 			String output = (word +" is even ");
 			return output;
	}
}