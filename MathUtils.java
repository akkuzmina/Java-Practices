public class MathUtils{
	public static boolean checkIfPrime(int i){
		int j=2;
		boolean isPrime = true;
		while (isPrime && j<(i/2)){
			if (i%j==0)
				isPrime = false;
			j++;
		}

		return isPrime;
	}
}