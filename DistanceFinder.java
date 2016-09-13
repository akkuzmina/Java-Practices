//Name:
import java.util.Scanner;

public class DistanceFinder
{
	public static void main(String[] args)
	{
			Scanner s = new Scanner(System.in);
			
			System.out.print("What is x1: ");
			double x1 = s.nextDouble();
			
			System.out.print("What is x2: ");
			double x2 = s.nextDouble();
			
			System.out.print("What is y1: ");
			double y1 = s.nextDouble();
			
			System.out.print("What is y2: ");
			double y2 = s.nextDouble();
			
			double distance = Math.sqrt(Math.pow((x2 - x1), 2)+ Math.pow((y2-y1),2));
			
			System.out.print("The distance between the points is: " + distance );
	}
}