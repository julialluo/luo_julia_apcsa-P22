//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		RayOddToEven test = new RayOddToEven();
		
		System.out.println( test.go( new int[]{7,1,5,3,11,5,6,7,8,9,10,12345,11} ) );
		System.out.println( test.go( new int[]{11,9,8,7,6,5,4,3,2,1,-99,7} ) );

		
	
	}
}



/*

6
2
3
1
-1
4
5
4
-1


*/