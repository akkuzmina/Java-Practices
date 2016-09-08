class Logic
{
	public static void main( String[] args )
	{
		boolean yes = true ;
		boolean no = false ;
		
		System.out.println( "Both YesYes True: " + ( yes && yes ) ) ; // true
		System.out.println( "Both YesNo True: " + ( yes && no ) ) ; // false
		
		System.out.println( "Either YesYes True: " + ( yes || yes ) ) ; // true
		System.out.println( "Either YesNo True: " + ( yes || no ) ) ; // true
		System.out.println( "Either NoNo True: " + ( no || no ) ) ; // false
		
		System.out.println( "Original Yes Value: " + yes ) ; // true
		System.out.println( "Inverse Yes Value: " + !yes ) ; // false
	}
}