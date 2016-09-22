//name:
import java.util.Scanner;
public class Grades
{ //asks the user for a grade between 0 and 100 
  //and outputs the letter version of that grade with a + or a _
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the grade:");

		int grade = in.nextInt();
		
		if ( grade < 0 )
		{
			System.out.println("X");
		}
		else if ( grade <= 59 )
		{
			System.out.println("F");
		}
		else if ( grade <= 69 )
		{
			System.out.println("D");
		}
		else if ( grade <= 72 )
		{
			System.out.println("C-");
		}
		else if ( grade <= 76 )
		{
			System.out.println("C");
		}
		else if ( grade <= 79 )
		{
			System.out.println("C+");
		}
		else if ( grade <= 82 )
		{
			System.out.println("B-");
		}
		else if ( grade <= 86 )
		{
			System.out.println("B");
		}
		else if ( grade <= 89 )
		{
			System.out.println("B+");
		}
		else if ( grade <= 92 )
		{
			System.out.println("A-");
		}
		else if ( grade <= 96 )
		{
			System.out.println("A");
		}
		else if ( grade <= 100 )
		{
			System.out.println("A+");
		}
		else
		{
			System.out.println("A++");
		}
	}
}