import java.util.Scanner;

public class PrimeNumbersSearch{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("This program will find all prime");
		System.out.println("numbers in between 2 and your maximum.");
		System.out.print("The maximum is: ");

		int max = s.nextInt();
		int[] primeDenList;
		primeDenList = new int[max];
		int n;
		for (int i=2; i<max; i++){
			if (MathUtils.checkIfPrime(i)){
				System.out.print(i+" ");
				primeDenList[n] = i;
				n++;
			}
		}
	}
}