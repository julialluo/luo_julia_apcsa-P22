//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int result = 0;
		int count = 0;
		for (int i = 0; i < ray.length-1; i++)
		{
			if (ray[i] > ray[ray.length-1])
			{
				result += ray[i];
				count ++;
			}
		}
		if (count == 0) return -1;
		return result;
	}
	
	
}