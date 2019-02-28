//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		int[] nums = new int[] {1, 5, 4, 3};
		System.out.println(RayDown.go(nums));
		
		nums[0] = 6;
		System.out.println(RayDown.go(nums));
		
		System.out.println(RayDown.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}));
	}
}