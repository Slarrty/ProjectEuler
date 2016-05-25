package Solutions;

public class SummationPrimes10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 0;
		for (int i = 2;i < 2000000;i++) {
			if (isPrime(i)) {
				System.out.println(i);
				n += i;
			}
		}
		System.out.println(n);
		
	}

	static boolean isPrime(int n) {
		int root = (int)Math.sqrt((double)n);
		for(int i = 2; i <= root; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
