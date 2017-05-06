package solutions;

import java.util.ArrayList;

public class EvenFibTermsSum02 {

	public static void main(String[] args) {
		int FOUR_MILLION = 4000000;

		ArrayList<Integer> fib = new ArrayList<Integer>(0);

		fib.add(1);
		fib.add(2);

		for (int i = 0; fib.get(i) < FOUR_MILLION && fib.get(i + 1) < FOUR_MILLION; i++) {
			int newTerm = fib.get(i) + fib.get(i + 1);

			fib.add(newTerm);
		}

		int sum = 0;

		for (int i = 0; i < fib.size(); i++) {
			if (fib.get(i) % 2 == 0) {
				sum += fib.get(i);
			}
		}

		System.out.println(sum);
	}

}
