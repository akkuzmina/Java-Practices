class Arithmetic
{
	public static void main( String[] args )
	{
		int num = 100 ; // Setting up num value
		int factor = 20 ; // Setting up factor value
		int sum = 0 ; // Setting up sum value
		
		sum = num + factor ; // Execute addition
		System.out.println( "Addition sum: " + sum) ; // Print out sum after addition
		sum = num - factor ; // Execute subtraction
		System.out.println( "Subtraction sum: " + sum) ; // Print out sum after subtraction
		
		sum = num * factor ; // Execute multiplication
		System.out.println( "Multiplication sum: " + sum) ; // Print out sum after multiplication
		sum = num / factor ; // Execute division
		System.out.println( "Division sum: " + sum) ; // Print out sum after division
		
	}
}