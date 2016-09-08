import java.util.Scanner;

public class ScannerExample
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("What is your name:") ;
		String name = s.next() ;
		
		System.out.print("Hello " + name) ;
	}
}