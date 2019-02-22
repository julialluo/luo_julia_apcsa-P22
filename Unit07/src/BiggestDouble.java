//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=d;
	}

	public double getBiggest()
	{
		double[] array = new double[] {one,two,three,four};
		double max = 0.0;
		
		for (int i=0; i<array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public String toString()
	{
	   return one +" "+ two +" "+ three +" "+ four + "\n" + "biggest = " + getBiggest();
	}
}