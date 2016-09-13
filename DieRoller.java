//Name:
import java.util.Scanner;
public class DieRoller
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("How many sides does the die have: ");
		int sides = s.nextInt();
		
		
		int roll = (int) ( Math.random() * sides + 1 );
		
		System.out.print("You rolled a die with "+sides+" sides and it was " + roll);
	}
}