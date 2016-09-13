//Name:
import java.util.Scanner;

public class RNG
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("What is the smallest value: ");
		int min = s.nextInt();
		
		System.out.print("What is the largest value: ");
		int max = s.nextInt();
		
		int numOfOutcomes = (max - min) + 1 ;
		
		int r = (int) (Math.random() * numOfOutcomes + min);
		
		System.out.print("Random number between "+min+" and "+max+" inclusive is: " + r);
	}
}