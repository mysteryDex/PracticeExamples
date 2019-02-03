package numbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhetherPrime(21);
		WhetherPrime(25);
		WhetherPrime(49);
		WhetherPrime(7);

		primeRange(27);

	}

	public static void WhetherPrime(int primeNumberVerifier) {
		int number = primeNumberVerifier;
		boolean flag = false;

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0)
				flag = true;
			//break;
		}

		if (!flag) {

			System.out.print("prime:" + number);
		} else {
			System.out.println("Not Prime Number:" + number);
		}
	}

	public static void primeRange(int rangeofNumbers) {
		// int rangeofNumbers;
		boolean flag = false;
		for (int range = 1; range <= rangeofNumbers; range++) {

			WhetherPrime(range);

		}
	}
}



