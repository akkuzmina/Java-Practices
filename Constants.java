/*
	Demonstrating constant variables/
*/

class Constants
{
	public static void main ( String[] args )
	{
		// Constant score values.
		final int TOUCHDOWN = 6 ;
		final int CONVERSION = 1 ;
		final int FIELDGOAL = 3 ;
		
		// Calculate points scored.
		int td , pat , fg , total ;  // 4*6=24
		td = 4 * TOUCHDOWN ;         // 3*1=3
		pat = 3 * CONVERSION ;       // 2*3=6
		fg = 2 * FIELDGOAL ;         // 24+3+6=33
		total = ( td + pat + fg ) ;
		
		// Output calculated total.
		System.out.println( "Score: " + total ) ;
	}
	
}