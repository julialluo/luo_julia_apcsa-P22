//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print(String s)
	{
		for (int x = s.length(); x>0;x--) {
			out.println(s.substring(0, x));
			
		}
	}
}