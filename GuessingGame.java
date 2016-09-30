//Name:
import java.util.Scanner;
public class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String in = "";//most rent holder
		int guess = 0;//accumilator
		int max = 100;
		int min = 1;
		int guessCount = 0;//counter variable
		while(!in.equals("2"))//2 is sentinel value
		{
			int numOfOutcomes = (max - min) + 1;
			guess = (int) (Math.random() * numOfOutcomes + min);
			
			System.out.println("Is your number "+guess+"?");
			System.out.println("1 - Too Low");
			System.out.println("2 - Correct!");
			System.out.println("3 - Too High");
			in = s.next();
		
			if (in.equals("1"))
				min = guess;
			if (in.equals("3"))
				max = guess;
			guessCount++;
		}
		System.out.println("Number of guesses:"+guessCount);
	}
}