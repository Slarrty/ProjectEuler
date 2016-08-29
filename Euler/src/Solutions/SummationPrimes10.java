package solutions;

public class SummationPrimes10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 0;
		long start = System.currentTimeMillis();
		for (int i = 2;i < 2000000;i++) {
			if (isPrime(i)) {
				n += i;
			}
		}
		System.out.println(n);
		
		long end = System.currentTimeMillis();
		
		System.out.println("Finished in: " + (end - start) + " ms");
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
