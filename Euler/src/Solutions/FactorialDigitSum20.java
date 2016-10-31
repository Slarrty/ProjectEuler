package Solutions;

import java.math.BigInteger;

public class FactorialDigitSum20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger itn = factorial(20);
		String str = itn.toString();
		
		int total = 0;
		
		for (int c2 = 1, c1 = 0;c2 <= str.length();c1++,c2++) {
			total += Integer.parseInt(str.substring(c1, c2));
		}
		
		System.out.println(str);
		System.out.println(total);
	}

	static BigInteger factorial(int n) {
		int count = 1;
		BigInteger total = BigInteger.valueOf(n);
		for (;count < n;count++) {
			total = total.multiply(BigInteger.valueOf(n-count));
		}
		return total;
	}
	
	static long factorial_long(int n) {
		int count = 1;
		long total = n;
		while (count < n) {
			total = total * (n-count);
			count++;
		}
		return total;
	}
}
