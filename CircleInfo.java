//Name: Yan Kuzmina
import java.util.Scanner;

public class CircleInfo
{
	
	private static Scanner scanner = new Scanner( System.in );
	public static void main(String[] args)
	{
		System.out.println( "What is the radius of the circle?" );
		
		int radius = Scanner.nextInt();
		
		double circumference = Math.PI * 2 * radius;
		double areaOfCircle = Math.PI * (Math.pow( radius, 2 ));
		
		System.out.println( "The area is: " + areaOfCircle );
		System.out.println( "The circumference is: " + circumference );
	}
}