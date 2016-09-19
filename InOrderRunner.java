//name:

import java.util.*;

public class InOrderRunner
{
	// main(): program starting point
	public static void main( String[] args ) 
	{
		// set up scanner to read input from user
		Scanner s = new Scanner(System.in);
		
		// prompt the user for input
		System.out.println( "Enter x, y, and z: " );
		
		//use the scanner to read in the input
		int x = s.nextInt() ;
		int y = s.nextInt() ;
		int z = s.nextInt() ;
		
		
		//if x, y, and z are int order, output a message to the user telling them 
		//that x, y, and z are in order
		if (InOrder.isInOrder(x,y,z))
		{
			System.out.println("The numbers xyz are in increasing order.");
		}
		
		//if x, y, and z are NOT in order, output a message to the user showing 
		//the numbers in sorted order
		
		
    }
}