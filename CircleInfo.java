//Name: Yan Kuzmina
import java.util.Scanner;

public class CircleInfo
{
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner( System.in );
		
		System.out.println( "What is the radius of the circle?" );
		
		double radius = s.nextDouble();
		
		double circumference = Math.PI * 2 * radius;
		double areaOfCircle = Math.PI * (Math.pow( radius, 2 ));
		
		System.out.println( "The area is: " + areaOfCircle );
		System.out.println( "The circumference is: " + circumference );
	}
}