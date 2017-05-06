package inProgress;

import java.math.BigInteger;

public class OneKFibNum25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger f1 = BigInteger.valueOf(1);
		BigInteger f2 = BigInteger.valueOf(1);
		BigInteger term = BigInteger.valueOf(1);
		long index = 2;
		
		f1.multiply(f2);
		
		for (;term.toString().length() < 1000;index++) {
			term = f1.add(f2);
			f2 = f1;
			f1 = term;
		}
		System.out.println(term);
		System.out.println(index);
	}

}
