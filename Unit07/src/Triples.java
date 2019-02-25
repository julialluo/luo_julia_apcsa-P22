//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private boolean aplusbequalsc(int a, int b, int c) {
		if (a*a+b*b==c*c) {
			return true;
		}
		return false;
	}
	public boolean oddoreven(int a, int b, int c) {
		if (c%2!=0) {
		if (a%2!=0) {
			if (b%2==0) {
				return true;
			}
			return false;
		}
		else {
			if(b%2!=0) {
				return true;
			}
			return false;
		}
	}
		else {
			return false;
		}
	}
	
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int min = Math.min(a,Math.min(b, c));
		
		for (int i = 1; i<=min; i++) {
			if(a%i==0 && b%i==0 && c%i==0) {
				max = i;
			}
		}

		return max;
	}
	
	private String checkTriples () {
		String triples = "";
		
		for (int a = 1; a<number;a++) {
			for (int b=a+1;b<number;b++) {
				for (int c=b+1; c<number;c++) {
					if (aplusbequalsc(a,b,c) && oddoreven(a,b,c) && greatestCommonFactor(a,b,c)==1) {
						triples = triples + "\n" + a + " " + b +" " + c;
					
					}
					
				}
			}
		}
	return triples;
	}

	public String toString()
	{
		String output= checkTriples();






		return output+"\n";
	}
}