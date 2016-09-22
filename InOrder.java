//name:

public class InOrder
{
	public static boolean isInOrder(int a, int b, int c)
	{
		boolean ret = false ;
		//return true if a is smaller than b and b is smaller than c
		if (a <= b)
		{
			if (b <= c)
			{
				ret = true ;
			}
		}
		return ret ;
	}

	public static int getSmallest(int a, int b, int c)
	{
		//return the smallest value of a, b, and c
		int ret = 0 ;
		if (a <= b)
		{
			if (a <= c)
			{
				ret = a ;
			}
		}
		if (b <= a)
		{
			if (b <= c)
			{
				ret = b ;
			}
		}
		if (c <= a)
		{
			if (c <= b)
			{
				ret = c ;
			}
		}
		return ret ;
	}
	
	public static int getLargest(int a, int b, int c)
	{
		//return the largest value of a, b, and c
		int ret = 0 ;
		if (a >= b)
		{
			if (a >= c)
			{
				ret = a ;
			}
		}
		if (b >= a)
		{
			if (b >= c)
			{
				ret = b ;
			}
		}
		if (c >= a)
		{
			if (c >= b)
			{
				ret = c ;
			}
		}
		return ret ;
	}
	
	public static int getMiddle(int a, int b, int c)
	{
		//return the middle value of a, b and c
		int ret = 0 ;
		if (a <= c)
		{
			if (b <= a)
			{
				ret = a ;
			}
			if (b <= c)
			{
				ret = b ;
			}
			if (c <= b)
			{
				ret = c ;
			}
		}
		
		if (c <= a)
		{
			if (a <= b)
			{
				ret = a ;
			}
			if (c <= b)
			{
				ret = b ;
			}
			if (b <= c)
			{
				ret = c ;
			}
		}
		return ret ;
	}
}