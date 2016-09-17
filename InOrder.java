//name:

public class InOrder
{
	public static boolean isInOrder(int a, int b, int c)
	{
		boolean ret = false ;
		//return true if a is smaller than b and b is smaller than c
		if (a < b)
		{
			if (b < c)
			{
				ret = true ;
			}
		}
		return ret ;
	}

	/*public static int getSmallest(int a, int b, int c)
	{
		//return the smallest value of a, b, and c
	}
	
	public static int getLargest(int a, int b, int c)
	{
		//return the largest value of a, b, and c
	}
	
	public static int getMiddle(int a, int b, int c)
	{
		//return the middle value of a, b and c
	}*/
}