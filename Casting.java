class Casting
{
	public static void main( String[] args )
	{
		/* double a ; // declaring variable a as a double
		a = 5 ; // assigning value of 5.0 to a */
		
		int a ; // declaring a as an int
		a = 3 ;
		// a = 1.5 will fail because cannot assign a double value to int
		
		System.out.println( "Variable a as an int is: " + a ) ;
		
		a = (int) 1.5 ; // 1.5 is cast into a
		
		System.out.println( "Variable a after 1.5 cast is: " + a ) ;
		
		a = (int) ( 2 * 5.7 ) ; //casting is one of the frist thing in order of execution
		
		System.out.println( "Variable a after 2 * 5.7 cast is: " + a ) ;
		
		// a = (int) 2 * 5.7 will fail wo/ parentheses
		
		
		//rounding
		
		double b ;
		b = 5.2 ;
		
		b = (int) (b + .5) ; 
		
		System.out.println( "Rounded 5.2 (b) is: " + b) ;
	
	}
}